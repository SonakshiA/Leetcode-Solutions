class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        
        int start = 0;
        int end;
        
        while(start<nums.length){
            int sum = 0;
            end = start;
            
            while(end<nums.length){
                sum += nums[end];
                if(sum==k){
                    res++;
                }
                end++;
            }
            start++;
        }
        return res;
    }
}