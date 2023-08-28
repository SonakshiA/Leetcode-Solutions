class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        
        int[] sec= new int[10];
        int[] gue= new int[10];
        
        for(int i=0;i<guess.length();i++){
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            
            if(s==g){
                bulls++;
            }else{
                sec[s]++;
                gue[g]++;
            }
        }
        
        for(int i=0;i<10;i++){
            cows+=Math.min(sec[i],gue[i]);
        }
        
        return bulls+"A"+cows+"B";
    }
}