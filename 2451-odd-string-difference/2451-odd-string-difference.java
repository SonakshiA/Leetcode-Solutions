class Solution {
    public String oddString(String[] words) {
        Map<List<Integer>,List<String>> map = new HashMap<>();
        
        for(String word: words){
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0;i<word.length()-1;i++){
                int diff = word.charAt(i+1)-word.charAt(i);
                l.add(diff);
            }
            if(!map.containsKey(l)){
                List<String> w = new ArrayList<>();
                w.add(word);
                map.put(l,w);
            }else{
                List<String> w = map.get(l);
                w.add(word);
                map.put(l,w);
            }
        }
        
        for(List<Integer> l: map.keySet()){
            if(map.get(l).size()==1){
                return map.get(l).get(0);
            }
        }
        return "";
    }
}