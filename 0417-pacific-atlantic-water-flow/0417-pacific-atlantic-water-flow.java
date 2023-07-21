class Solution {
    private void dfs(int row, int col, int prevHeight, boolean[][] vis, int[][]heights, int n, int m){
        if(row<0 || row>=n || col<0 || col>=m || vis[row][col]|| heights[row][col]<prevHeight){
            return;
        }
        vis[row][col] = true;
        
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        
        for(int i=0;i<4;i++){
            int nRow = row+delRow[i];
            int nCol = col+delCol[i];
                
            dfs(nRow,nCol,heights[row][col],vis,heights,n,m);                
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        boolean[][] pac = new boolean[n][m];
        boolean[][] atl = new boolean[n][m];
        
        
        for(int col=0;col<m;col++){
            dfs(0,col,heights[0][col],pac,heights,n,m);
            dfs(n-1,col,heights[n-1][col],atl,heights,n,m);
            
        }
        
        for(int row=0;row<n;row++){
            dfs(row,0,heights[row][0],pac,heights,n,m);
            dfs(row,m-1,heights[row][m-1],atl,heights,n,m);
            
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pac[i][j] && atl[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
}