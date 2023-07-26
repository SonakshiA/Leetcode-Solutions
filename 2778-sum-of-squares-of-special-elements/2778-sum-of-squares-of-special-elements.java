class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int len = nums.length;
        
        for(int i=1;i<=len;i++){
            if(len%i==0)
                sum+=Math.pow(nums[i-1],2);
        }
        return sum;
    }
}