class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new LinkedHashMap<>();
        
        for(String s: arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        int seen = 0;
        for(String key: map.keySet()){
            if(map.get(key)==1){
                seen++;
                if(seen==k){
                    return key;
                }
            }
        }
        return "";
    }
}