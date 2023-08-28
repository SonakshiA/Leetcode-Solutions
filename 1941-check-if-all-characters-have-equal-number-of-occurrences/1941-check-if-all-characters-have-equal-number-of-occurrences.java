class Solution {
    public boolean areOccurrencesEqual(String s) {
         HashMap<Character, Integer> m = new HashMap<>();

        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        int x = m.get(s.charAt(0));
        for(Character c: m.keySet()){
            if(m.get(c)!=x)
                return false;
        }
        return true;
    }
}