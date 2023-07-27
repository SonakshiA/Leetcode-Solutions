class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]<=threshold){
                int j = i+1;
                while(j<nums.length && (nums[j]%2!=nums[j-1]%2) && nums[j]<=threshold)
                    j++;
                ans = Math.max(ans,j-i);
            }else continue;
        }
        return ans;
    }
}