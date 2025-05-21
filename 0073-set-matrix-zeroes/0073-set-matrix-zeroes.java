class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}


class Solution {
    private void convert(int[][] matrix, int sr, int sc){
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i<m ;i++){
            matrix[sr][i] = 0;
        }
        
        for(int j = 0; j<n; j++){
            matrix[j][sc] = 0;
        }
      
    }
    
    
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        ArrayList<Pair> l = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    l.add(new Pair(i,j));
                }
            }
        }
        
        for(Pair p:l){
            System.out.println(p.first + " " + p.second);
            convert(matrix,p.first, p.second);
        }
    }
}