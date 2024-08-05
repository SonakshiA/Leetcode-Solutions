class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> w1 = new HashMap<>();
        HashMap<String,Integer> w2 = new HashMap<>();
        
        for(String w:words1){
            w1.put(w,w1.getOrDefault(w,0)+1);
        }
        
        for(String w:words2){
            w2.put(w,w2.getOrDefault(w,0)+1);
        }
        
        int res = 0;
        
        for(String key: w1.keySet()){
            if(w1.get(key)==1){
                if(w2.containsKey(key) && w2.get(key)==1){
                    res++;
                }
            }
        }
        return res;
    }
}