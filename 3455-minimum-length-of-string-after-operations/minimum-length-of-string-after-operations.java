class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        int delCount = 0;
        for(Character ch: freq.keySet()){
            int frequency = freq.get(ch);
            if(frequency>=3 && frequency%2==1){
                delCount += frequency-1;
            }else if (frequency>=3 && frequency%2==0) {
                delCount += frequency-2;
            }
        }
        return s.length()-delCount;
    }
}