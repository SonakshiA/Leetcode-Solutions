class Solution {
public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            int count = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),count+1);
        }

        List<Character> characters = new ArrayList<>(map.keySet());
        Collections.sort(characters, (ch1,ch2)->map.get(ch2)-map.get(ch1));

        for(char ch: characters){
            int count = map.get(ch);
            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}