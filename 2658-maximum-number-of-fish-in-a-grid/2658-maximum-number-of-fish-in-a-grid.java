class Solution {
    
    private int dfs(int[][] grid, int startRow, int startCol){
        int n = grid.length;
        int m = grid[0].length;
        
        if(startRow<0 || startRow>=n || startCol<0 || startCol>=m)
            return 0;
        
        if(grid[startRow][startCol]==0)
            return 0;
        
        int fish = grid[startRow][startCol];
        grid[startRow][startCol] = 0; //visited
        
        return fish + dfs(grid,startRow+1,startCol) + dfs(grid,startRow-1,startCol) +               dfs(grid,startRow,startCol-1) + dfs(grid,startRow, startCol+1);
    }
    public int findMaxFish(int[][] grid) {
        int res = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j]!=0){
                    res = Math.max(res,dfs(grid,i,j));
                }
            }
        }
        return res;
    }
}