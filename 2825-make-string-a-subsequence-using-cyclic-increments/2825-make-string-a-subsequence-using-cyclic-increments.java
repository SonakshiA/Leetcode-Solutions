class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int str2Index=0;
        int lenStr1 = str1.length();
        int lenStr2 = str2.length();
        
        for(int str1Index = 0; str1Index<lenStr1 && str2Index<lenStr2; str1Index++){
            if(str1.charAt(str1Index)==str2.charAt(str2Index) || str1.charAt(str1Index)+1==str2.charAt(str2Index) || str1.charAt(str1Index)-25==str2.charAt(str2Index)){
                str2Index++;
            }
        }
        return str2Index==lenStr2;
    }
}