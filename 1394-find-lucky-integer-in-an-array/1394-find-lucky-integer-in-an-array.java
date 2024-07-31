class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int x:arr){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        int ans = -1;
        for(int key: freq.keySet()){
            if(key==freq.get(key)){
                if(key>ans){
                    ans = key;
                }
            }
        }
        return ans;
    }
}