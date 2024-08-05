class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> l = new ArrayList<>();
        HashMap<String, Integer> w1 = new HashMap<>();
        HashMap<String, Integer> w2 = new HashMap<>();
        
        for(String w:s1.split(" ")){
            w1.put(w,w1.getOrDefault(w,0)+1);
        }
        
        for(String w:s2.split(" ")){
            w2.put(w,w2.getOrDefault(w,0)+1);
        }
        
        for(String key: w1.keySet()){
            if(w1.get(key)==1 && !w2.containsKey(key)){
                l.add(key);
            }
        }
        
        for(String key: w2.keySet()){
            if(w2.get(key)==1 && !w1.containsKey(key)){
                l.add(key);
            }
        }
        String[] ans = new String[l.size()];
        
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}