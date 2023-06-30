class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int start = 0;
        int s = 0;
        
        for(int l = 0, r =0; r<nums.length; r++){
            s+= nums[r];
            System.out.println(s);
            
            while(s>=target){
                len = Math.min(len,r-l+1);
                s-=nums[l++];
            } 
        }
         return (len==Integer.MAX_VALUE) ? 0 : len;
    }
}