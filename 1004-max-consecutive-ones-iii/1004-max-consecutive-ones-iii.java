class Solution {
    public int longestOnes(int[] nums, int k) {
        int l =0;
        int zeroes = 0;
        int ans = 0;
        
        for(int r =0; r<nums.length; r++){
            if(nums[r]==0)
                zeroes++;
            
            while(zeroes>k){
               if(nums[l++]==0){
                   zeroes--;
               }
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}