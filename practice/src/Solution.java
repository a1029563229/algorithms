import java.util.Arrays;

class Solution {
  public int oddCells(int n, int m, int[][] indices) {
    int N = 0;
    int[][] arr = new int[][]{};
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = 10;
      }
    }
    System.out.println(Arrays.toString(arr));
    return N;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int n = 2, m = 3;
    int[][] indices = new int[][] { { 1, 1 }, { 0, 0 } };
    int N = solution.oddCells(n, m, indices);
    System.out.println(N);
  }
}