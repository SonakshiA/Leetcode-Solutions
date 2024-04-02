class Solution {
    private int countSetBits(int n){
        int count = 0;
        while(n>0){
            int lastBit = n & 1;
            count += lastBit;
            n = n>>>1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1;i<=n;i++){
            res[i] = countSetBits(i);
        }
        return res;
    }
}