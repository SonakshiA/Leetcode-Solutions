class Solution {
    int f(int index, int target, int[] nums, int[][] dp){
        if(index==0){
            if(target==0 && nums[0]==0) return 2;
            if(target==0  || nums[0]==target) return 1;
            else return 0;
        }
        
        if(dp[index][target]!=-1) return dp[index][target];
        
        int notPick = f(index-1,target,nums,dp);
        int pick = 0 ;
        
        if(target>=nums[index]){
            pick = f(index-1,target-nums[index],nums,dp);
        }
        
        return dp[index][target] = pick+notPick;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for(int x:nums){
            totalSum+=x;
        }
        
        if(totalSum-target<0 || (totalSum-target)%2==1) return 0;
        
        int s2 = (totalSum-target)/2;
        
        int[][] dp = new int[nums.length][s2+1];
        
        for(int[] row:dp)
            Arrays.fill(row,-1);
        
        return f(nums.length-1,s2,nums,dp);
    }
}

//subset with difference d
//s1-s2=d
//s1 = total-s2
//total-2s2 = d
//total-d/2 = s2