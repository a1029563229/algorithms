import java.util.Arrays;

public class DivisionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        this.splitArr(arr, 0, arr.length - 1);
        return arr;
    }

    private void splitArr(int[] arr, int start, int end) {
        if (end != start) {
            int mid = (end + start) / 2;
            splitArr(arr, start, mid);
            splitArr(arr, mid + 1, end);
            mergeArr(arr, start, end);
        }
    }

    private void mergeArr(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int[] leftArr = Arrays.copyOfRange(arr, start, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, end + 1);
        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {
            if (i == leftArr.length) {
                arr[k] = rightArr[j];
                j++;
                continue;
            }

            if (j == rightArr.length) {
                arr[k] = leftArr[i];
                i++;
                continue;
            }

            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 32, 11, 22, 17, 222, 42, 162, 82, 1, 1231, 12, 2 };
        Sort divisionSort = new DivisionSort();
        int[] sortedArr = divisionSort.sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
