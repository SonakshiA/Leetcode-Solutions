class Solution {
    public int countPoints(String rings) {
         HashMap<Integer,ArrayList<Character>> map = new HashMap<>();
        int count = 0;
        for(int i=1;i<rings.length();i=i+2){
            ArrayList<Character> l = map.getOrDefault(Character.getNumericValue(rings.charAt(i)),new ArrayList<>());
            l.add(rings.charAt(i-1));
            map.put(Character.getNumericValue(rings.charAt(i)),l);
        }
        

        for(Integer rod : map.keySet()){
            ArrayList<Character> l = map.get(rod);
            if(l.contains('R') && l.contains('G') && l.contains('B'))
               count++;
        }
        return count;
    }
}