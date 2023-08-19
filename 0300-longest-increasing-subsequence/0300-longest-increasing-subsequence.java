class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        
        
        for(int ind=n-1;ind>=0;ind--){
            for(int prev_index=ind-1;prev_index>=-1;prev_index--){
                int notPick = 0 + dp[ind+1][prev_index+1];
                
                int pick = 0;
                
                 if(prev_index==-1 || nums[ind]>nums[prev_index]){
                     pick = 1 + dp[ind+1][ind+1];
                }
                
                dp[ind][prev_index+1] = Math.max(pick,notPick);
            }
        }
        
        return dp[0][0];
    }
}