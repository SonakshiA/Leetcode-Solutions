class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long local = 0;
        for(int num:nums){
            if(num==0){
                res += ++local;
            }else{
                local = 0;
            }
        }
        return res;
    }
}