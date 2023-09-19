class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int sum = 0;
        for(int i=0;i<rows;i++){
            sum+=mat[i][i];
            sum+=mat[i][rows-i-1];
        }
        
        if(rows%2!=0){
            sum-=mat[rows/2][rows/2];
        }
        return sum;
    }
}

