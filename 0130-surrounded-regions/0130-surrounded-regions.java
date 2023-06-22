class Solution {
    
    private void dfs(char[][] board, int[][] vis, int startRow, int startCol){
        vis[startRow][startCol] = 1;
        
        int n = board.length;
        int m = board[0].length;
        
        for(int delRow=-1; delRow<=1; delRow++){
            for(int delCol=-1; delCol<=1; delCol++){
                
                //ignore diagnol elements
                 if((delRow==-1 && delCol==-1) || (delRow== -1 && delCol==1) || (delRow==1 && delCol                     == -1) || (delRow==1 && delCol==1)){
                        continue;
                    }
                int nRow = startRow + delRow;
                int nCol = startCol + delCol;
                
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol]==0 && board[nRow][nCol] ==                 'O'){
                    dfs(board,vis,nRow,nCol);
                }
            }
        }
        
    }
    
    public void solve(char[][] board) {
       int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m];
        
        //checking the first and last row (boundary)
        for(int j = 0 ; j<m; j++){
            if(board[0][j] == 'O' && vis[0][j]==0){
                dfs(board,vis,0,j);
            }
            
            if(vis[n-1][j]==0 && board[n-1][j]=='O'){
                dfs(board,vis,n-1,j);
            }
        }
        
        //checking the first and last column (boundary)
        for(int i = 0; i<n ; i++){
            if(board[i][0] == 'O' && vis[i][0]==0){
                dfs(board,vis,i,0);
            }
            
            if(board[i][m-1]=='O' && vis[i][m-1]==0){
                dfs(board,vis,i,m-1);
            }
        }
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j] == 'O' && vis[i][j]==0){
                    board[i][j] = 'X';
                }
            }
        }
    }
}

/*

mark those Os to Xs which aren't connected to the boundary 'O' 

*/