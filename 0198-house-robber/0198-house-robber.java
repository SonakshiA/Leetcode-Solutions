class Solution {
    private int f(int index,int[] dp,int[] nums){
        if(index==0) return nums[index];
        if(index<0) return 0;
        
        if(dp[index]!=-1) return dp[index];
        
        int pick = nums[index] + f(index-2,dp,nums);
        int notPick = 0 + f(index-1,dp,nums);
        
        return dp[index] = Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return f(nums.length-1,dp,nums);
    }
}