class Solution {
    private boolean backtrack(char[][] board, int row, int col, int index, int n, int m, String word){
        //this basecase should always appear first
        if(index==word.length()){
            return true;
        }
        if(row<0 || row==n || col<0 || col==m || board[row][col]=='!' || board[row][col]!=word.charAt(index)){
            return false;
        }
        char c = board[row][col];
        board[row][col] = '!';
        
        boolean top = backtrack(board,row-1,col,index+1,n,m,word);
        boolean bottom = backtrack(board,row+1,col,index+1,n,m,word);
        boolean left = backtrack(board,row,col-1,index+1,n,m,word);
        boolean right = backtrack(board, row,col+1,index+1,n,m,word);
        
        board[row][col] = c;
        return top || bottom || left || right;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int index = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(index)){
                    if(backtrack(board,i,j,index,n,m,word))
                        return true;
                }
            }
        }
        return false;
    }
}