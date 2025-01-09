class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int prefixLen = pref.length();
        
        for(String word: words){
            if(word.length()>=prefixLen){
                String wordPrefix = word.substring(0,prefixLen);
                if(wordPrefix.equals(pref)){
                    count++;
                }
            }
        }
        return count;
    }
}