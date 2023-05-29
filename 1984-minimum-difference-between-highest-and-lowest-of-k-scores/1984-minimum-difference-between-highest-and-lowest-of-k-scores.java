class Solution {
    public int minimumDifference(int[] nums, int k) {
         if(k==1){
            return 0;
        }

        int minDifference = Integer.MAX_VALUE;
        Arrays.sort(nums);

        int start = 0;
        int end = k-1;

        while(end<nums.length){
            int diff = nums[end] - nums[start];
            if(diff<minDifference){
                minDifference = diff;
            }
            start++;
            end++;
        }

        return minDifference;
    }
}