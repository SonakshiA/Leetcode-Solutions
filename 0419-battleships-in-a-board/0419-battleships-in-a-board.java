class Solution {
    
    private void dfs(char[][] board, int[][] visited, int sr, int sc){
        visited[sr][sc] = 1;
        
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        
        int n = board.length;
        int m = board[0].length;
        
        for(int i = 0 ;i<4; i++){
            //to traverse in four directions around current row and column
            int row = sr + delRow[i];
            int col = sc + delCol[i];
            
            if(row>=0 && row<n && col>=0 && col<m && visited[row][col]==0 && board[row][col]=='X'){
                dfs(board,visited,row,col);
            }
        }
         
    }
    
    public int countBattleships(char[][] board) {
        int ans = 0;
        int n = board.length;
        int m = board[0].length;
        
        int[][] visited = new int[n][m];
        
        for (int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                if(board[i][j] == 'X' && visited[i][j]==0){
                    ans++;
                    dfs(board,visited,i,j);
                }
            }
        }
        return ans;
    }
}

//Use DFS to traverse the board