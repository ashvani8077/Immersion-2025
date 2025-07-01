public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];
        fillSpiral(arr);
        printMatrix(arr);
    }

    public static void fillSpiral(int[][] arr) {
        int n = arr.length;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = num++;
            }
            left++;
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
