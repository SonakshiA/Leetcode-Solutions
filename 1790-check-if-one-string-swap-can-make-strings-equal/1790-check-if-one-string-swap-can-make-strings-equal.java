class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            return true;
        }

        int string1[] = new int[26];
        int string2[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            string1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            string2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (string1[i] != string2[i]) {
                return false; //don't have same number of characters
            }
        }
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }

        if (count == 2) return true;

        if (count == 0) {
            for (int i = 0; i < 26; i++) {
                if (string1[i] > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}