class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        
        int res = 0;
        
        for(int i =0 ;i<words.length;i++){
            int flag = 0;
            for(int j =0; j<words[i].length();j++){
                if(brokenLetters.indexOf(words[i].charAt(j))!=-1){
                    flag = 1;
                }
            }
            if (flag==0) res++;
        }
        return res;
    }
}