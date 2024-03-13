class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int i=0,j;
        while(i<nums.length){
            int product = nums[i];
            j = i+1;
            max = Math.max(max,product);
            while(j<nums.length){
                product*= nums[j];
                max = Math.max(max,product);
                j++;
            }
            i++;
        }
        return max;
    }
}