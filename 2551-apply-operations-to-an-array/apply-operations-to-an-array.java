class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int[] ans = new int[nums.length];
        int index = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[index++] =nums[i];
            }
        }

        for(int i=index;i<nums.length;i++){
            ans[i] = 0;
        }
        return ans;
    }
}