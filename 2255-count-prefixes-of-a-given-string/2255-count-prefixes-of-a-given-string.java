class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String word: words){
            int wordLen = word.length();
            if(wordLen<=s.length()){
                if(s.substring(0,wordLen).equals(word)){
                    count++;
                }
            }
        }
        return count;
    }
}