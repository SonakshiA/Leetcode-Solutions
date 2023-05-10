class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                StringBuilder sb = new StringBuilder();
                int m = l / i;
                String sub = s.substring(0, i);
                for (int j = 0; j < m; j++) { //replicate the substring the number of times it occurs in the string 
                    sb.append(sub);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}