class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int maxLen = 0;
        while(start<nums.length){
            int end = start;
            int count= 0;
            while(end<nums.length){
                if(nums[end]==1){
                    count++;
                    end++;
                }
                else{
                    break;
                }
            }
            start = end+1;
            maxLen = Math.max(maxLen,count);
        }
        return maxLen;
    }
}