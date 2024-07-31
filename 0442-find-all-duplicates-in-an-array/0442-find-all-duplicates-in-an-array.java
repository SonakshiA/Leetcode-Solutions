class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        
        for(int key:freq.keySet()){
            if(freq.get(key)>1){
                ans.add(key);
            }
        }
        return ans;
    }
}