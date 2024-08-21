class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer, Integer> prefix = new HashMap<>();
        HashMap<Integer,Integer> suffix = new HashMap<>();
        
        int n = nums.length;
        int ans[] = new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(!prefix.containsKey(nums[j])){
                    prefix.put(nums[j],1);
                }
            }
            int prefix_val = prefix.size();
            
            for(int j=i+1;j<n;j++){
                if(!suffix.containsKey(nums[j])){
                    suffix.put(nums[j],1);
                }
            }
            
            int suffix_val = suffix.size();
            ans[i] = prefix_val-suffix_val;
            prefix.clear();
            suffix.clear();
        }
        return ans;
    }
}