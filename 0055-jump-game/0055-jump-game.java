class Solution {
    public boolean canJump(int[] nums) {
        int reach=0;
        int i=0;
        for(;i<nums.length && i<=reach;i++){
                reach=Math.max(i+nums[i],reach);
        }
        System.out.println(reach);
        return i==nums.length;
    }
}

//we keep a track of the maximum we can reach from a given index