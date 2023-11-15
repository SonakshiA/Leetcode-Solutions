class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        
        for(int i=0;i+2<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue; //to avoid duplicates
            
            // Choose nums[i] as the first num in the triplet,
            // and search the remaining nums in [i + 1, n - 1]
            
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                
                if(sum==target)
                    return sum;
                
                if(Math.abs(sum-target)<Math.abs(ans-target))
                    ans = sum;
                
                if(sum<target) l++;
                else r--;
            }
        }
        return ans;
    }
}