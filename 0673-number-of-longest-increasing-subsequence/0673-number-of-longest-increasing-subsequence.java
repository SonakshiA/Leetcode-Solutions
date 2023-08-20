class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        
        int[] dp = new int[n];
        int[] count = new int[n];
        
        int max = 1;
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        
        for(int index=0;index<n;index++){
            for(int prev_index=0;prev_index<index;prev_index++){
                if(nums[prev_index]<nums[index] && 1+dp[prev_index]>dp[index]){
                    dp[index] = 1+dp[prev_index];
                    count[index] = count[prev_index];
                }else if(nums[prev_index]<nums[index] && 1+dp[prev_index]==dp[index]){
                     count[index] += count[prev_index];
                }
            }
            if(dp[index]>max){
                max = dp[index];
            }
        }
        int nos = 0;
        
        for(int i=0;i<n;i++){
            if(dp[i]==max){
                nos+=count[i];
            }
        }
        return nos;
    }
}