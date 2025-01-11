class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)
            return false;
        
        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        int oddCount = 0;

        for(Character ch: freq.keySet()){
            if(freq.get(ch)%2==1){
                oddCount++;
            }
        }
        if(oddCount>k){
            return false;
        }
        return true;
    }
}