class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long currentSum = 0;
        int begin = 0;
        int end = 0;
        
        //to keep track of index of number
        HashMap<Integer,Integer> map = new HashMap<>();
        
        while(end<nums.length){
            int currNum = nums[end];
            int lastOccurence = map.getOrDefault(currNum,-1);
            
            while(begin <= lastOccurence || end-begin+1>k){
                currentSum -= nums[begin];
                begin++;
            }
            map.put(currNum,end);
            currentSum+=nums[end];
            if(end-begin+1==k){
                ans=Math.max(ans,currentSum);
            }
            end++;
        }
        return ans;
    }
}