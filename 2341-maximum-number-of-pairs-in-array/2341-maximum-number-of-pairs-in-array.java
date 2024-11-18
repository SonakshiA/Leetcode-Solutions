class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int pairs = 0;
        int leftovers = 0;
        
        for(Integer key: map.keySet()){
            pairs += map.get(key)/2;
            leftovers += map.get(key)%2;
        }
        return new int[]{pairs,leftovers};
    }
}