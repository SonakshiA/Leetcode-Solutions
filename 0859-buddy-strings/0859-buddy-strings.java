class Solution {
    public boolean buddyStrings(String s, String goal) {
                if (s.length() != goal.length()) {
            return false;
        }

        int string1[] = new int[26];
        int string2[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            string1[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < goal.length(); i++) {
            string2[goal.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (string1[i] != string2[i]) { //the two strings don't have same number of letters
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            }
        }

        if (count == 2) return true;

        if (count == 0) { //suppose s and goal are equal, but one or more characters occur more than once, they can also be swapped with each other
            for (int i = 0; i < 26; i++) {
                if (string1[i] > 1) return true;
            }
        }
        return false;
    }
}