package Sort;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j -1]); j--) {
                exch(a, j -1, j);
            }
        }
    }

    private static boolean less(int v, int w) {
        return v < w;
    }

    private static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 412, 213, 12, 312, 1, 23, 413, 1, 3, 123, 12 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
