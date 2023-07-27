class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        
        for(int i=0;i<words.length-1;i++){
            if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0))
                return false;
        }
        
        if(words[0].charAt(0)!=words[words.length-1].charAt(words[words.length-1].length()-1))
            return false;
        
        return true;
        
    }
}
/*
The last character of a word is equal to the first character of the next word.
The last character of the last word is equal to the first character of the first word.
*/