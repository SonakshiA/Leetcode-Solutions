class Solution {
    private void dfs(char[][] board, int[][] vis, int row, int col, int n, int m){
        vis[row][col] = 1;
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        
        for(int i=0;i<4;i++){
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];
            
            if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && board[nRow][nCol]=='O' && vis[nRow][nCol]==0){
                dfs(board,vis,nRow,nCol,n,m);
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m];
        
        for(int j=0;j<m;j++){
            if(board[0][j] == 'O' && vis[0][j]==0){
                dfs(board,vis,0,j,n,m);
            }
            if(board[n-1][j] == 'O' && vis[n-1][j]==0){
                dfs(board,vis,n-1,j,n,m);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O' && vis[i][0]==0){
                dfs(board,vis,i,0,n,m);
            }
            if(board[i][m-1]=='O' && vis[i][m-1]==0){
                dfs(board,vis,i,m-1,n,m);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && vis[i][j]==0){
                    board[i][j] = 'X';
                }
            }
        }
    }
}