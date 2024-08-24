class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i+2<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue; //remove duplicates
            int l = i+1;
            int r = nums.length-1;
            
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum==0){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[l]);
                    ans.add(nums[r]);
                    res.add(ans);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                } else if(sum<0) l++;
                else r--;
            }
        } 
        return res;
    }
}