class Solution {
    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] rowSum = new int[rows];
        int[] colSum = new int[cols];

        // sum rows
        for(int i=0;i<rows;i++) {
            int sum = 0;
            for(int j=0; j<cols; j++) {
                sum += mat[i][j];
            }
            rowSum[i] = sum;
        }

        //sum cols
        for(int j=0;j<cols;j++) {
            int sum = 0;
            for(int i=0; i<rows; i++) {
                sum += mat[i][j];
            }
            colSum[j] = sum;
        }

        int ans = 0;
        for(int i=0 ;i<rows; i++){
            for(int j=0;j<cols;j++){
                if (mat[i][j]==1 & rowSum[i] == 1 && colSum[j] == 1)
                    ans++;
            }
        }
        return ans;
    }
}