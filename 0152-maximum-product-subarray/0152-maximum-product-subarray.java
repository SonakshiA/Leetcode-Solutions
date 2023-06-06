class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int i = 0, j;

        while (i < nums.length) {
            int product = nums[i];
            max = Math.max(max,product);
            j = i+1;
            while (j < nums.length) {
                product *= nums[j];
                max = Math.max(product, max);
                j++;
            }
            i++;
        }
        return max;
    }
}