class Solution {
    private int check(String w1, String w2){
        HashSet<Character> w1_set = new HashSet<>();
        for(char ch:w1.toCharArray()){
            w1_set.add(ch);
        }
        
        HashSet<Character> w2_set = new HashSet<>();
        for(char ch:w2.toCharArray()){
            w2_set.add(ch);
        }
        
        return w1_set.equals(w2_set)?1:0;
    }
    public int similarPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(check(words[i],words[j])==1){
                    count++;
                }
            }
        }
        return count;
    }
}