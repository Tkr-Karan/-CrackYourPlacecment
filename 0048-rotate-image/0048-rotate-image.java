class Solution {

   // swapping function
    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        // transpose the 2-d matrix
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                swap(matrix, i, j);
            }
        }

        // reverse the every row
        for (int i = 0; i < row; i++) {
            reverseArray(matrix[i]);
        }
    }
}