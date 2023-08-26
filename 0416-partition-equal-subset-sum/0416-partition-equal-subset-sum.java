class Solution {
    private boolean f(int index, int[] nums, int[][] dp, int target){
        if(target==0) return true;
        if(index==0) return (nums[index]==target);
        
        if(dp[index][target]!=-1) return dp[index][target]==0?false:true;
        
        boolean notTaken = f(index-1,nums,dp,target);
        boolean take = false;
        if(nums[index]<=target){
            take = f(index-1,nums,dp,target-nums[index]);
            dp[index][target] = take||notTaken?1:0;
        }
        
        return notTaken||take;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        
        if(sum%2==1) return false;
        
        int target = sum/2;
        int[][] dp = new int[nums.length][target+1];
        
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        
        return f(nums.length-1,nums,dp,target);
    }
}