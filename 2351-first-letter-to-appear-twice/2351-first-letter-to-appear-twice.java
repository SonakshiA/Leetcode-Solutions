class Solution {
    public char repeatedCharacter(String s) {
        int[] chars = new int[26];
        
        for(int i=0; i<s.length(); i++){
            chars[s.charAt(i)-'a']++;
            
            if(chars[s.charAt(i)-'a']==2)
                return s.charAt(i);
        }
        return 'a';
    }
}