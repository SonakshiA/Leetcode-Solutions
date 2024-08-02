class Solution {
    public int minSwaps(int[] nums) {
        
        int numberOfOnes = 0;
        int n = nums.length;
        
        //count number of ones
        for(int num:nums){
            numberOfOnes+=num;
        }
        
        if(numberOfOnes == 0 || numberOfOnes == n) return 0;
        
        int currentOnes = 0;
        
        //number of ones in the first window
        for(int i=0;i<numberOfOnes;i++){
            currentOnes += nums[i];
        }
        
        int maxOnes = currentOnes;
        
        //numberOfOnes is the window size in sliding window
        
        for(int i=0;i<n;i++){
            currentOnes-=nums[i];
            currentOnes+=nums[(i+numberOfOnes)%n];
            maxOnes = Math.max(maxOnes,currentOnes);
        }
        return numberOfOnes-maxOnes;
    }
}