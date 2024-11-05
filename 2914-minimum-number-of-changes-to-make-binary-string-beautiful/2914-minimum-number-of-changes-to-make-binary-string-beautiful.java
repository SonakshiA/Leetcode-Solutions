class Solution {
    public int minChanges(String s) {
        int consecCount = 0;
        int minChanges=0;
        char currentChar = s.charAt(0);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==currentChar){
                consecCount++;
                continue;
            }
            
            if(consecCount%2==0){
                consecCount=1; //start a new sequence
            }else{
                consecCount=0;
                minChanges++;
            }
            currentChar = s.charAt(i);
        }
        return minChanges;
    }
}