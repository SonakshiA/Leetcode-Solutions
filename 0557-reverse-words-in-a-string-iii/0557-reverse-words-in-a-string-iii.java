class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            StringBuilder word = new StringBuilder(words[i]);
            sb.append(word.reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}