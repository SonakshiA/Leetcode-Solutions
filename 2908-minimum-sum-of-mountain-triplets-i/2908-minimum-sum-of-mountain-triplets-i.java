class Solution {
    public int minimumSum(int[] nums) {
        int sum = Integer.MAX_VALUE;
        int arrayLen = nums.length;
        
        for(int i=0;i<arrayLen;i++){
            for(int j=i+1;j<arrayLen;j++){
                for(int k=j+1;k<arrayLen;k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        int s = nums[i]+nums[j]+nums[k];
                        sum = Math.min(s,sum);
                    }
                }
            }
        }
        return (sum==Integer.MAX_VALUE)?-1:sum;
    }
}