class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int i = 0;
        while(i<nums.length && i<=maxReach){ //i<= maxReach so that we do no gp to indices that cannot be reached
            maxReach = Math.max(maxReach, i+nums[i]);
            i++;
        }
        if(i==nums.length)
            return true;
        return false;
    }
}