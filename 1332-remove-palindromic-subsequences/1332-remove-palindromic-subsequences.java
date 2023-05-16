class Solution {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()){
            return 0;
        }
        
        
        boolean isPalindrome = true;
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        
        if(s.length()==1 || isPalindrome==true){
            return 1;
        }
        
        else{
            return 2;
        }
        
    }
}

//observation:
//it takes 0,1,2 steps to remove subsequences entirely 