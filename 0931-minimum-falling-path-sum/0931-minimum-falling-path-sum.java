class Solution {
    private int f(int i, int j, int n, int[][] dp, int[][] matrix){
		if(j<0 || j>=n) return (int)Math.pow(10,9);
		
		if(i==0){
			return matrix[0][j];
		}

		if(dp[i][j]!= Integer.MIN_VALUE) return dp[i][j];

        int up =  matrix[i][j] + f(i-1,j,n,dp,matrix);
		int diagnol_left = matrix[i][j] + f(i-1,j-1,n,dp,matrix);
		int diagnol_right = matrix[i][j] + f(i-1,j+1,n,dp,matrix);

		return dp[i][j] = Math.min(up, Math.min(diagnol_left,diagnol_right));
	}
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		
		int res = Integer.MAX_VALUE;

		for(int j=0;j<n;j++){
			int ans = f(n-1,j,n,dp,matrix);
			res = Math.min(res,ans);
		}
		return res;
    }
}