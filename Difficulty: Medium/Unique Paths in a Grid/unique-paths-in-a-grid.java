import java.util.Arrays;

class Solution {
    public int uniquePaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] memo = new int[n][m];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return findPaths(0, 0, grid, memo);
    }

    private int findPaths(int r, int c, int[][] grid, int[][] memo) {
        if (r >= grid.length || c >= grid[0].length || grid[r][c] == 1) {
            return 0;
        }

        if (r == grid.length - 1 && c == grid[0].length - 1) {
            return 1;
        }

        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int rightPaths = findPaths(r, c + 1, grid, memo);
        int downPaths = findPaths(r + 1, c, grid, memo);

        memo[r][c] = rightPaths + downPaths;
        return memo[r][c];
    }
}
