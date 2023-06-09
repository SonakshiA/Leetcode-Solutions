class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        
        for(int x: nums) sum+=x;
        
        int temp = 0;
        
        for(int i =0; i<nums.length; i++){
            sum-=nums[i];
            if(sum==temp) return i;
            temp+=nums[i];
        }
        
        return -1;
    }
}