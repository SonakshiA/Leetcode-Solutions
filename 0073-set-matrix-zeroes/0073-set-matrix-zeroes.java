class Pair{
    int row;
    int col;
    
    public Pair(int r, int c){
        row = r;
        col = c;
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<Pair> q = new LinkedList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0)
                    q.add(new Pair(i,j));
            }
        }
        
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();
            for(int j=0;j<m;j++){
                matrix[row][j]=0;
            }
            for(int i=0;i<n;i++){
                matrix[i][col] = 0;
            }
        }
    }
}