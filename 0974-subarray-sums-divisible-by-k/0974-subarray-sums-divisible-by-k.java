class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k];
        int sum = 0;
        int count = 0;
        arr[0] = 1; //when we get 0 index, means remainder is 0
        for(int num:nums){
            sum = (sum+num)%k;
            if(sum<0) sum+=k;
            count += arr[sum];
            arr[sum]++;
        }
        return count;
    }
}

/*
The problem requires us to find the number of subarrays whose sum is divisible by a given integer k. The core intuition is to leverage the properties of remainders. If the cumulative sum up to two different indices gives the same remainder when divided by k, then the subarray between these two indices has a sum that is divisible by k
*/