class Solution {
    int n;
    public int minSteps(int n) {
        if(n==1) return 0;
        this.n = n;
        return 1 + minStepsHelper(1,1); //first is a Copy All operation
    }
    
    private int minStepsHelper(int currLen, int pasteLen){
        if(currLen==n) return 0;
        if(currLen>n) return 1000;
        
        //copy all and paste
        int opt1 = 2 + minStepsHelper(currLen*2,currLen);
        
        //just paste
        int opt2 = 1 + minStepsHelper(currLen + pasteLen, pasteLen);
        
        return Math.min(opt1,opt2);
    }
}