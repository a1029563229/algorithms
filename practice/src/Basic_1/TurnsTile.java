package Basic_1;

public class TurnsTile {
    private static int coinNum = 0;
    private static int refundNum = 0;
    private static int onceCoinNum = 0;
    private static boolean isLocked = true;
    private static boolean isAlarm = false;
    public void reset() {
        coinNum = 0;
        refundNum = 0;
        isLocked = true;
        isAlarm = false;
        onceCoinNum = 0;
    };

    public boolean locked() {
        return isLocked;
    };

    public boolean alarm() {
        return isAlarm;
    }

    public void coin() {
        if (onceCoinNum > 0) {
            coinNum--;
            refundNum++;
        }
        coinNum++;
        onceCoinNum++;
        isLocked = false;
    };

    public void pass() {
        if (coinNum == 0) {
            isAlarm = true;
            return;
        }
        onceCoinNum = 0;
        isLocked = true;
    };

    public int coins() {
        return coinNum;
    };

    public int refunds() {
        return refundNum;
    };
}
