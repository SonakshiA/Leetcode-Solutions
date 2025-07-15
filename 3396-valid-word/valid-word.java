class Solution {
    public boolean isValid(String word) {
        boolean hasVowel = false;
        boolean hasConsonant = false;

        Set<Character> vowelSet = new HashSet<>();
        Set<Character> consonantSet = new HashSet<>();

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
                    vowelSet.add(c);
                    hasVowel = true;
                } else {
                    consonantSet.add(c);
                    hasConsonant = true;
                }
            }
        }
        //return !vowelSet.isEmpty() && !consonantSet.isEmpty();
        return hasVowel && hasConsonant;
    }
}