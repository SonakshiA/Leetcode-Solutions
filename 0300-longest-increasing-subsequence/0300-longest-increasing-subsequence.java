class Solution {
    private int f(int index, int prev_index, int[] nums,int[][] dp){
        if(index==nums.length){
            return 0;
        }
        
        if(dp[index][prev_index+1]!=-1) return dp[index][prev_index+1];
        
        int notPick = 0 + f(index+1,prev_index,nums,dp);
        int pick = Integer.MIN_VALUE;
        if(prev_index==-1 || nums[index]>nums[prev_index]){
             pick = 1 + f(index+1,index,nums,dp);
        }
        
        return dp[index][prev_index+1] = Math.max(pick,notPick);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return f(0,-1,nums,dp);
    }
}