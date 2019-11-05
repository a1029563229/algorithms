package Basic_1;

import junit.framework.*;
public class TestTurnstile extends TestCase{
    public TestTurnstile(String name) {
        super(name);
    }

    public void setUp() {
        TurnsTile t = new TurnsTile();
        t.reset();
    }

    public void testInit() {
        TurnsTile t = new TurnsTile();
        assert (t.locked());
        assert (!t.alarm());
    }

    public void testCoin() {
        TurnsTile t = new TurnsTile();
        t.coin();
        TurnsTile t1 = new TurnsTile();
        assert (!t1.locked());
        assert (!t1.alarm());
        assertEquals(1, t1.coins());
    }

    public void testCoinAndPass() {
        TurnsTile t = new TurnsTile();
        t.coin();
        t.pass();

        TurnsTile t1 = new TurnsTile();
        assert (t1.locked());
        assert (!t1.alarm());
        assertEquals("coins", 1, t1.coins());
    }

    public void testTwoCoins() {
        TurnsTile t = new TurnsTile();
        t.coin();
        t.coin();

        TurnsTile t1 = new TurnsTile();
        assert (!t1.locked());
        assertEquals("coins", 1, t1.coins());
        assertEquals("refunds", 1, t1.refunds());
        assert(!t1.alarm());
    }

    public void testPass() {
        TurnsTile t = new TurnsTile();
        t.pass();

        TurnsTile t1 = new TurnsTile();
        assert (t1.alarm());
        assert (t1.locked());
    }

    public void testTwoOperations() {
        TurnsTile t = new TurnsTile();
        t.coin();
        t.pass();
        t.coin();
        assert (!t.locked());
        assertEquals("coins", 2, t.coins());
        t.pass();
        assert (t.locked());
    }
}
