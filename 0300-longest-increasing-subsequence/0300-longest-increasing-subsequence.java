class Solution {
    public int f(int index, int prev, int[] nums, int[][] dp, int n){
        if(index==n)
            return 0;
        if(dp[index][prev+1]!=-1) 
            return dp[index][prev+1];
        
        int notTake = 0 + f(index+1,prev,nums,dp,n);
        int take = 0;
        
        if(prev==-1 || nums[index]>nums[prev]){
            take = 1 + f(index+1,index, nums,dp,n);
        }
        
        dp[index][prev+1] = Math.max(take,notTake);
        return dp[index][prev+1];
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return f(0,-1,nums,dp,nums.length);
    }
}