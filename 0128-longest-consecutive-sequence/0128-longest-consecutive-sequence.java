class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmaller){
                cnt++;
                lastSmaller = nums[i];
            }else if(nums[i]!=lastSmaller){
                cnt=1;
                lastSmaller = nums[i];
            }
            longest = Math.max(cnt,longest);
        }
        return longest;
    }
}