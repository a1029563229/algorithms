package Sort;

import edu.princeton.cs.algs4.Insertion;
import junit.framework.TestCase;

import java.util.Arrays;

public class TestSort extends TestCase {
    public void testSelection() {
        int[] arr = new int[]{ 412, 213, 12, 312, 1, 23, 413, 1, 3, 123, 12 };
        SelectionSort.sort(arr);
        assertEquals(
                "[1, 1, 3, 12, 12, 23, 123, 213, 312, 412, 413]",
                Arrays.toString(arr)
        );
    }

    public void testInsertion() {
        int[] arr = new int[]{ 412, 213, 12, 312, 1, 23, 413, 1, 3, 123, 12 };
        InsertionSort.sort(arr);
        assertEquals(
                "[1, 1, 3, 12, 12, 23, 123, 213, 312, 412, 413]",
                Arrays.toString(arr)
        );
    }
}
