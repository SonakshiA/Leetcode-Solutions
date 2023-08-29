class Solution {
    public long[] sumOfThree(long num) {
        long[] ans = new long[3];
        int flag=0;
        if(num%3==0){
            flag=1;
            long y=num/3;
            ans[0] = y-1;
            ans[1] = y;
            ans[2] = y+1;
        }
        
        if(flag==1)
            return ans;
        return new long[]{};
    }
}