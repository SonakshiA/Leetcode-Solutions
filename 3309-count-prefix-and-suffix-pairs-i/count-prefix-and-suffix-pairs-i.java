class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int len = words[i].length();
                if(len<=words[j].length()){
                    boolean isPrefix = words[j].substring(0,len).equals(words[i]);
                    boolean isSuffix = words[j].substring(words[j].length()-len,words[j].length()).equals(words[i]);
                    if(isPrefix && isSuffix){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}