class Solution {
    public boolean wordPattern(String pattern, String s) {
        int patternLength = pattern.length();
        String splitUp[] = s.split(" ");
        int stringLength = s.split(" ").length;

        if (patternLength != stringLength) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < patternLength; i++) {
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(splitUp[i])){
                    return false;
                }
            } else{
                if(map.containsValue(splitUp[i])){ //to ensure bijection
                    return false;
                }
                map.put(pattern.charAt(i),splitUp[i]);
            }
        }
        return true;
    }
}