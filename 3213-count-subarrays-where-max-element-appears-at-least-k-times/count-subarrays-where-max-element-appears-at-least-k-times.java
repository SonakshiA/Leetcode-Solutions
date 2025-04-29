class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int max = 0;
        int start = 0;
        int n = nums.length;
        int maxInWindow = 0;

        //find max element
        for(int num: nums){
            if(num>max){
                max=num;
            }
        }

        for(int end=0 ; end<n; end++){
            if(nums[end]==max){
                maxInWindow++;
            }
            while(maxInWindow==k){
                if(nums[start]==max){
                    maxInWindow--;
                }
                start++;
            }
            System.out.println("start: " + start);
            ans += start;
        }
        return ans;
    }
}