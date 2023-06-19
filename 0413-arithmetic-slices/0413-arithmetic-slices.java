class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
            return 0;
        
        int ans = 0, count = 0, diff = Integer.MAX_VALUE;
        
        for(int i = 1; i<nums.length; i++){
            int newDiff = nums[i] - nums[i-1];
            
            if(newDiff == diff) {
                ans+= count++;
                System.out.println(count);
            }
            else{
                diff = newDiff;
                count = 1;
            }
        }
        
        return ans;
    }
}