class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0, prefixSum = 0, sortedPrefixSum = 0;
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            sortedPrefixSum+=i;
            if(prefixSum==sortedPrefixSum){
                chunks++;
            }
        }
        return chunks;
    }
}