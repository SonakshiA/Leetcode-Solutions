class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        
        for(int key: freq.keySet()){
            if(freq.get(key)==1)
                return key;
        }
        return -1;
    }
}