class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<n;i++){
            if(grid[i][i] == 0 || grid[i][n-i-1] == 0)
                return false;
            else{
                grid[i][i] = 0;
                grid[i][n-i-1] = 0;
            }      
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0) return false;
            }
        }
        return true;
    }
}