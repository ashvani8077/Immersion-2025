public class LCS1143DP{
    public static void main(String[] args) {
        
    }

    public int longestCommonSubsequence(String s1, String s2) {
        return lcsHelper(s1, s2, s1.length(), s2.length());
    }

    private int lcsHelper(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcsHelper(s1, s2, m - 1, n - 1);
        }

        return Math.max(
            lcsHelper(s1, s2, m - 1, n),
            lcsHelper(s1, s2, m, n - 1)
        );
    }
}