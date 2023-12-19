class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int start=0;
        int max = 1;
        while(start<nums.length-1){
            int end = start+1;
            while(end<nums.length){
                if(nums[end]>nums[end-1]){
                    max = Math.max(max,end-start+1);
                    end++;
                }else{
                    break;
                }
            }
            start++;
        }
        return max;
    }
}