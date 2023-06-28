class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int left = 0;
        
        while(left<n){
            int right = left;
            while(right<n){
                if((right-left+1)%2==1){
                    int newSum = 0;
                    for(int i = left; i<=right; i++){
                        newSum+=arr[i];
                    }
                    sum+=newSum;
                }
                right++;
            }
            left++;
        }
        return sum;
        
    }
}