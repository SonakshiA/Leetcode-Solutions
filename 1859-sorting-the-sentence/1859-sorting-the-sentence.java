class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer,String> map = new TreeMap<>();
        
        for(String word: s.split(" ")){
            int val = Character.getNumericValue(word.charAt(word.length()-1));
            map.put(val,word.substring(0,word.length()-1));
        }
        StringBuilder sb = new StringBuilder();
        for(Integer key: map.keySet()){
            sb.append(map.get(key) + " ");
        }
        //sb.trim();
        return sb.toString().trim();
    }
}