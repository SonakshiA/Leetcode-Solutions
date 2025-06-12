class Solution {
    public int maxDifference(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       int len = s.length();
       int a1 = Integer.MIN_VALUE;
       int a2 = Integer.MAX_VALUE;
       for(int i=0; i<len; i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }

       for(Character k: map.keySet()) {
        int val = map.get(k);
        if (val%2==1) {
            a1 = Math.max(a1, val);
        } else {
            a2 = Math.min(a2, val);
        }
       }
       return (a1-a2);
    }
}

// a1 should be the highest odd value
// a2 should be the lowest even value