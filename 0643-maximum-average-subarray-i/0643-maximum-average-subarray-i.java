class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        int sum = 0;
        
        for(int i =0; i<k; i++){
            sum+=nums[i];
        }
        
        double avgMax = (double) sum/k;
        int currSum = sum;
        for(int i=k; i<nums.length; i++){
            currSum += nums[i] - nums[i-k];
            double avg = (double) currSum/k;
            avgMax = Math.max(avgMax,avg);
        }
        
        return avgMax;
    }
}