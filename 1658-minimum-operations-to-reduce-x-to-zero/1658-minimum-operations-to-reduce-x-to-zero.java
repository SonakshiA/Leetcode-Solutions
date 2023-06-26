class Solution {
    public int minOperations(int[] nums, int x) {
           int sum = 0;
           for(int n: nums)
               sum+=n;

           int desiredSum = sum-x; 
           int maxLen = -1;
           int currSum = 0;

          for(int l = 0, r = 0; r<nums.length; r++){
              currSum += nums[r];

              while(l<=r && currSum> desiredSum) currSum-=nums[l++];
              if(currSum == desiredSum) maxLen = Math.max(maxLen, r-l+1);
          }

           return maxLen == -1 ? -1 : nums.length-maxLen;
    }
}

/*

Find the longest subarray having a total of sum-x where sum is the total of all elements of that array




*/