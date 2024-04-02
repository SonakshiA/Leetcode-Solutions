class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            int last_bit = n&1;
            count+= last_bit;
            n=n>>>1;
        }
        return count;
    }
}