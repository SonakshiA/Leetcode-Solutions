class Solution {
    public int minDeletions(String s) {
        Set<Integer> freq = new HashSet<Integer>();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int cnt = 0;
        
        for(char ch : map.keySet()){
            int val = map.get(ch);
            if(!freq.contains(val)){
                freq.add(val);
            }else{
                while(freq.contains(val) &&  val>0){
                    val--;
                    cnt++;
                }
                freq.add(val);
            }
        }
        return cnt;
    }
}