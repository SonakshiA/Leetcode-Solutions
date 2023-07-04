class Solution {
    private int dfs(int[][] grid, int sr, int sc) {
        int n = grid.length;
        int m = grid[0].length;

        int fish = grid[sr][sc];
        grid[sr][sc] = 0;

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nRow = sr + delRow[i];
            int nCol = sc + delCol[i];

            if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] != 0) {
                 fish += dfs(grid, nRow, nCol);
            }
        }
        return fish;
    }
    
    public int findMaxFish(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    res = Math.max(res,dfs(grid, i, j));
                }
            }
        }
        return res;
    }
}