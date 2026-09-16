import java.util.Arrays;

class Solution {
    private int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n - 1, m - 1, text1, text2);
    }

    private int solve(int i, int j, String text1, String text2) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (text1.charAt(i) == text2.charAt(j)) {
            dp[i][j] = 1 + solve(i - 1, j - 1, text1, text2);
        } else {
            dp[i][j] = Math.max(solve(i - 1, j, text1, text2), solve(i, j - 1, text1, text2));
        }
        return dp[i][j];
    }
}
