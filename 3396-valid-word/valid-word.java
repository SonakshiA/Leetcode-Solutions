class Solution {
    public boolean isValid(String word) {
        boolean hasVowel = false;
        boolean hasConsonant = false;

        if(word.length() < 3) {
            return false;
        }

        for(int i=0;i<word.length();i++){
            Character c = word.charAt(i);
            if(!Character.isLetterOrDigit(c)) {
                return false;
            }
            if(Character.isLetter(c)) {
                if(c=='a' || c=='A' || c=='e' || c=='E' ||
                c=='i' || c=='I' || c=='o' || c=='O' ||
                c=='u' || c=='U') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }
        return hasVowel && hasConsonant;
    }
}