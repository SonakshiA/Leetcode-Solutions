class Solution {
    public int findLHS(int[] nums) {
        int i = 0;
        int maxLen = 0;
        Arrays.sort(nums);

        for(int j=0;j<nums.length;j++){
            while(nums[j]-nums[i]>1){
                i++;
            }
            if(nums[j]-nums[i]==1){
                maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }
}