class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        if(m*n!=r*c)
            return mat;
        
        int[][] ans = new int[r][c];
        
        int output_row = 0;
        int output_col = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[output_row][output_col] =mat[i][j];
                output_col++;
                
                if(output_col==c){
                    output_col=0;
                    output_row++;
                }
            }
        }
        
        return ans;
    }
}