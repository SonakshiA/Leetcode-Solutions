class Solution {
    public int arrayPairSum(int[] nums) {
         int sum = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i=i+2){
            int j = i+1;
            sum+= Math.min(nums[i],nums[j]);
        }

        return sum;

    }
}