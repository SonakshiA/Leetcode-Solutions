class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int start = 0;
        
        while (start+k-1<arr.length){
            int sum = 0;
            int end = start;
            int copy = k;
            
            while(end<arr.length && copy>0){
                sum+=arr[end];
                end++;
                copy--;
            }
            if((sum/k)>=threshold){
                count++;
            }
            start++;
        }
        return count;
    }
}