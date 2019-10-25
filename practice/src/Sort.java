import java.util.Arrays;

class Sort {
    // 插入排序
    public int[] sortByInsert(int[] sortArr) {
        int[] arr = Arrays.copyOf(sortArr, sortArr.length);
        if (arr.length == 1) return arr;
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                int n = arr[0];
                arr[0] = arr[1];
                arr[1] = n;
                return arr;
            }
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int j = i - 1;
            while (j >= 0 && num < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = num;
                j -= 1;
            }
        }
        return arr;
    }

    // 分治法排序
    public int[] sortByDivision(int[] arr) {
        int[] sortedArr = new int[arr.length];
        int[][] equalArray = this.splitEqualArray(arr);
        int[] leftArr = equalArray[0];
        int[] rightArr = equalArray[1];
        int i = 0, j = 0, k = 0;
        while (i < arr.length) {
            System.out.println(j);
            int leftVal = leftArr[j];
            int rightVal = rightArr[k];
            if (leftVal < rightVal) {
                sortedArr[i] = leftVal;
                j += 1;
            } else {
                sortedArr[i] = rightVal;
                k += 1;
            }
            i++;
        }
        return sortedArr;
    }

    private int[][] splitEqualArray(int[] arr) {
        int mid = arr.length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[mid];
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
            rightArr[i] = arr[i + mid];
        }
        return new int[][]{ leftArr, rightArr };
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 5, 7, 2, 4, 6, 8 };
        Sort sort = new Sort();
        int[] sortedArr = sort.sortByDivision(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}