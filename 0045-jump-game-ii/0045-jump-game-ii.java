class Solution {
    public int jump(int[] nums) {
        int begin = 0, end = 0, jumps = 0;
        int farthest = 0;
        for(int i=0 ;i<nums.length-1; i++){
            farthest = Math.max(farthest,i+nums[i]);
            
            if(i==end){
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}

//https://www.youtube.com/watch?v=BRnRPLNGWIo