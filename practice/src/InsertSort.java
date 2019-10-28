import java.util.Arrays;

class InsertSort implements Sort {
    // 插入排序
    public int[] sort(int[] sortArr) {
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
                j -= 1;
            }
            arr[j + 1] = num;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 32, 11, 22, 17, 222, 42, 162, 82 };
        Sort insertSort = new InsertSort();
        int[] sortedArr = insertSort.sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}