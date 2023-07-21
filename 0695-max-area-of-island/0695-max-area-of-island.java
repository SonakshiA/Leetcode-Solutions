class Solution {
    private int dfs(int[][] grid, int[][] vis,int sr,int sc){
        int n = grid.length;
        int m = grid[0].length;
        
        if(sr<0 || sr>=n || sc<0 || sc>=m){
            return 0;
        }
        
        if(grid[sr][sc]==0){
            return 0;
        }
        if(vis[sr][sc]==1){
            return 0;
        }
        
        vis[sr][sc]=1;
        
        return 1+dfs(grid,vis,sr+1,sc) + dfs(grid,vis,sr-1,sc) + dfs(grid,vis,sr,sc+1) +                                dfs(grid,vis,sr,sc-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        int[][] vis = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    ans  = Math.max(ans,dfs(grid,vis,i,j));
                }
            }
        }
        return ans;
    }
}