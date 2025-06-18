class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod = 12345;
        int rows = grid.length, cols = grid[0].length;
        int total = rows * cols;

        long[] prefix = new long[total + 1];
        long[] suffix = new long[total + 1];
        prefix[0] = 1;
        suffix[total] = 1;

        for (int i = 0; i < total; i++) {
            int r = i / cols, c = i % cols;
            prefix[i + 1] = (prefix[i] * grid[r][c]) % mod;
        }

        for (int i = total - 1; i >= 0; i--) {
            int r = i / cols, c = i % cols;
            suffix[i] = (suffix[i + 1] * grid[r][c]) % mod;
        }

        int[][] result = new int[rows][cols];
        for (int i = 0; i < total; i++) {
            int r = i / cols, c = i % cols;
            result[r][c] = (int)((prefix[i] * suffix[i + 1]) % mod);
        }

        return result;
    }
}
