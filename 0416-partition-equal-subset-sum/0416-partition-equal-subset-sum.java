class Solution {
    public boolean solveRec(int index, int[] nums, int target, int[][] dp){
        if(index==0) return nums[0] == target;
        if(target==0) return true;
        
        if(dp[index][target]!=-1) 
            return dp[index][target]==0?false:true;
            
        boolean notPick = solveRec(index-1,nums,target,dp);
        boolean pick = false;
        if(nums[index]<=target){
            pick = solveRec(index-1,nums,target - nums[index],dp);
        }
        dp[index][target] = notPick||pick?1:0;
        return notPick||pick;
        
    }
    public boolean canPartition(int[] nums) {
        int x=0;
        
        for(int num:nums)
            x+=num;
        
        if(x%2==1) return false;
        
        int target = x/2;
        
        int dp[][] = new int[nums.length][target+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
            
        return solveRec(nums.length-1,nums,target,dp);
    }
}