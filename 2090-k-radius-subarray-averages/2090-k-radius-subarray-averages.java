class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k==0)
            return nums;
        
        int n = nums.length;
        int[] averages = new int[n];
        Arrays.fill(averages,-1);
        
        
        
        long[] prefixSum = new long[n+1];
        
        for(int i =0; i<n; i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        
        
        for(int i = k; i<n-k; i++){
            int leftBound = i-k, rightBound = i+k;
            long subSum = prefixSum[rightBound+1] - prefixSum[leftBound];
            int average = (int) (subSum/ (2*k+1));
            averages[i] = average;
        }
        
        return averages;
    }
}