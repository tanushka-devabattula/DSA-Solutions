class Solution {
    public boolean isSafe(char[][] grid, int r, int c, boolean[][] visited) {
        int n = grid.length;
        int m = grid[0].length;
        return (r >= 0 && r < n && c >= 0 && c < m && grid[r][c] == '1' && !visited[r][c]);
    }

    public void dfs(char[][] grid, int r, int c, boolean[][] visited) {
        visited[r][c] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        for (int k = 0; k < 4; k++) {
            int nr = r + dr[k];
            int nc = c + dc[k];
            if (isSafe(grid, nr, nc, visited)) {
                dfs(grid, nr, nc, visited);
            }
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int islands = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, visited);
                    islands++;
                }
            }
        }
        return islands;
    }
}
