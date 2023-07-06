class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        int sum = 0;
        
        for(int x:nums){
            sum+=x;
        }
        
        
        int r = nums.length-1;
        
        int s=0;
        while(s<=sum && r>=0){
            sum-=nums[r];
            s+=nums[r];
            l.add(nums[r]);
            r--;
        }
        return l;
    }
}