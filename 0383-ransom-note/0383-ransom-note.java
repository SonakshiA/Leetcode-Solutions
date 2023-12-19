class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        int[] mag = new int[26];
        
        for(Character ch:ransomNote.toCharArray()){
            ransom[ch-'a']++;
        }
        
        for(Character ch:magazine.toCharArray()){
            mag[ch-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(mag[i]<ransom[i])
                return false;
        }
        return true;
    }
}