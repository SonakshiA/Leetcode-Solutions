class Solution {
    public boolean isItPossible(String word1, String word2) {
        int m1[] = new int[256];
        int m2[] = new int[256];
        
        for(int i=0;i<word1.length();i++){
            m1[word1.charAt(i)]++;
        }
        
        for(int i=0;i<word2.length();i++){
            m2[word2.charAt(i)]++;
        }
        
        for(char ch1='a';ch1<='z';ch1++){
            for(char ch2='a';ch2<='z';ch2++){
                if(m1[ch1]>0 && m2[ch2]>0){
                    m1[ch1]--;
                    m2[ch1]++;
                    m2[ch2]--;
                    m1[ch2]++;
                    
                    int unique1 = 0;
                    int unique2 = 0;
                    
                    for(char ch='a';ch<='z';ch++){
                        if(m1[ch]>0) unique1++;
                        
                        if(m2[ch]>0) unique2++;
                        
                    }
                     if(unique1==unique2) return true;
                        
                        m1[ch1]++;
                        m2[ch1]--;
                        m2[ch2]++;
                        m1[ch2]--;
                }
            }
        }
        return false;
    }
}