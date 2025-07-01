class Solution {
    public int possibleStringCount(String word) {
        int consecCharacters = 0;

        for(int i=0; i< word.length() - 1; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                consecCharacters++;
            }
        }
        return consecCharacters + 1;
    }
}