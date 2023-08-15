class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long max = 0;
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        
        while(j<n){
            ans+=nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            
            if(j-i+1==k){
                if(map.size()==k){
                    max = Math.max(max,ans);
                }
                
                ans-=nums[i];
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
                j++;
            }else if(j-i+1<k){
                j++;
            }
        }
        return max;
    }
}