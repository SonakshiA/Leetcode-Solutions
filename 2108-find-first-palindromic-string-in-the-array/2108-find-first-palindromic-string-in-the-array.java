class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            if(isPalindrome(word))
                return word;
        }
        return "";
    }
    
    private boolean isPalindrome(String word){
        int i=0, j=word.length()-1;
        
        while(i<=j){
            if(word.charAt(i)==word.charAt(j)){
                i++;
                j--;
            }else
                return false;
        }
        return true;
    }
}