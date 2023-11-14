class Solution {
    public void makeAMap(String word, int[] wordMap){
        for(int i=0;i<word.length();i++){
            wordMap[word.charAt(i)-'a']++;
        }
    }
    
    
    public boolean canBeMade(int[] charsMap, int wordMap[]){
        for(int i=0;i<26;i++){
            if(charsMap[i]<wordMap[i])
                return false;   
        }
        return true;
    }
    
    
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        int[] charsMap = new int[26];
        for(int i=0;i<chars.length();i++){
            charsMap[chars.charAt(i)-'a']++;
        }
        for(String word: words){
            int[] wordMap = new int[26];
            makeAMap(word, wordMap);
            if(canBeMade(charsMap,wordMap)){
                ans += word.length();
            }
        }
        return ans;
    }
}