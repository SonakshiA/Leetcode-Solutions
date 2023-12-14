class Solution {
    private int f(List<List<Integer>> triangle, int[][] dp, int i, int j){
        int n = triangle.size();
        
        if(i==n-1)
            return triangle.get(i).get(j);
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int down = triangle.get(i).get(j) + f(triangle,dp,i+1,j);
        int diagnol = triangle.get(i).get(j) + f(triangle,dp,i+1,j+1);
        
        return dp[i][j] = Math.min(down,diagnol);
    }
    
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        
        return f(triangle,dp,0,0);
    }
}