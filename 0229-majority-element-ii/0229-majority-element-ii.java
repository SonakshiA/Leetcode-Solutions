class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for(Integer key:freq.keySet()){
            if(freq.get(key)>(n/3))
                ans.add(key);
        }
        return ans;
    }
}