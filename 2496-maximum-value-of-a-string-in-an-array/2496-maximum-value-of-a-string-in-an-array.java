class Solution {
     private boolean isNumerical(String word) {
        char[] ch = word.toCharArray();
        for (char c : ch) {
            if (Character.isLetter(c)) return false;
        }
        return true;
    }
    
    public int maximumValue(String[] strs) {
          int max = 0;
        for (String word : strs) {
            max = Math.max(max, isNumerical(word) ? Integer.parseInt(word) : word.length());
        }
        return max;
    }
}