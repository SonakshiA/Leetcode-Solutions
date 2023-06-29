class Solution {
    public int removeDuplicates(int[] nums) {
        int insert_index = 1;
        for(int i =1 ; i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[insert_index] = nums[i];
                insert_index++;
            }
        }
        return insert_index;
    }
}