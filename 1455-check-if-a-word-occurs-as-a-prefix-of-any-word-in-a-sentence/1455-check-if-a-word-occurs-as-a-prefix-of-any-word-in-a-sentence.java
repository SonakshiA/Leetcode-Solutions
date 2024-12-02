class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int prefixLen = searchWord.length();
        String[] words = sentence.split(" ");
        
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=prefixLen){
                String prefix = words[i].substring(0,prefixLen);
                System.out.println(prefix);
                if(prefix.equals(searchWord)){
                    return (i+1);
                }
            } 
        }
        return -1;
    }
}