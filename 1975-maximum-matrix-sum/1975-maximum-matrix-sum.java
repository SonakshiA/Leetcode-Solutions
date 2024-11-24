class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long absSum = 0;
        int n = matrix.length;
        int countNeg = 0;
        int minAbs = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                absSum+=Math.abs(matrix[i][j]);
                if(matrix[i][j]<0){
                    countNeg++;
                }
                if(Math.abs(matrix[i][j])<minAbs){
                    minAbs = Math.abs(matrix[i][j]);
                }
            }
        }
        if(countNeg%2==0)
            return absSum;
        return absSum - minAbs - minAbs;
    }
}