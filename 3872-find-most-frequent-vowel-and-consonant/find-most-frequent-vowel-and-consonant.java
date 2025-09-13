class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> mapVowels = new HashMap<>();
        HashMap<Character, Integer> mapCons = new HashMap<>();
        
        for(int i=0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
            ch == 'o' || ch == 'u') {
                mapVowels.put(ch, mapVowels.getOrDefault(ch,0)+1);
            } else {
                mapCons.put(ch, mapCons.getOrDefault(ch,0)+1);
            }
        }

        int ans = 0;
        int maxVowel = 0;
        int maxCons = 0;

        for(Character key: mapVowels.keySet()) {
            if (mapVowels.get(key) > maxVowel) {
                maxVowel = mapVowels.get(key);
            }
        }

        for(Character key: mapCons.keySet()) {
            if (mapCons.get(key) > maxCons) {
                maxCons = mapCons.get(key);
            }
        }
        return maxVowel + maxCons;
    }
}