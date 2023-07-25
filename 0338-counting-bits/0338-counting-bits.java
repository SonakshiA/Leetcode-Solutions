class Solution {
    private int setBits(int i){
        int count = 0;
        while(i!=0){
            int lastBit = i&1;
            count+=lastBit;
            i=i>>1;
        }
        return count;
    }
    
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = setBits(i);
        }
        return ans;
    }
}