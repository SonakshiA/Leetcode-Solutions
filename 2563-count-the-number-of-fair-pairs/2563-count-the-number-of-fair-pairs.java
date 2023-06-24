class Solution {
    private long countPairs(int[] nums, int k){
        //two pointer approach
        int i = 0, j = nums.length-1;
        long count = 0;
        while(i<j){
            if(nums[i]+nums[j]<=k){
                count += (j-i); // (j-i) because all pairs from i to j will have sum<=k
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums,upper) - countPairs(nums,lower-1);
    }
}



/* if we find the number of pairs having sum<upper and pairs having sum<lower-1 and subtract, 
    we get our answer

*/