public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse_n = 0;
        for(int i=0;i<32;i++){ //run 32 times
            reverse_n = reverse_n<<1;
            int bit = n & 1;
            reverse_n = reverse_n | bit;
            n=n>>1;
        }
        return reverse_n;
    }
}