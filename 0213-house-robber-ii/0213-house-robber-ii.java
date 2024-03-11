class Solution {
    int f(int index, int[] nums, int[] dp){
        if(index==0) return nums[index];
        if(index<0) return 0;
        
        if(dp[index]!=-1) return dp[index];
        
        int pick = nums[index] + f(index-2,nums,dp);
        int notPick = 0 + f(index-1,nums,dp);
        
        return dp[index] = Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        
        int[] arr1 = Arrays.copyOfRange(nums,0,nums.length-1);
        int[] arr2 = Arrays.copyOfRange(nums,1,nums.length);
        
        return Math.max(f(arr1.length-1,arr1,dp1),f(arr2.length-1,arr2,dp2));
    }
}