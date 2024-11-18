class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        ArrayList<Character> chars = new ArrayList<>();
        
        for(char ch: word.toCharArray()){
            chars.add(ch);
        }
        
        for(char ch: chars){
            if(ch>='a' && ch<='z'){
                if(chars.contains((char)(ch-32))){
                    set.add(ch);
                }
            }
        }
        return set.size();
    }
}