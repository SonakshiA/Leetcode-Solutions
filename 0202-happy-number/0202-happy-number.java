class Solution {
    
    private int squareOfDigits(int n){
        int ans = 0;
        while(n>0){
            ans += (n%10)*(n%10);
            n/=10;
        }
        return ans;
    }
    
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do{
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        }while(slow!=fast);
        
        return slow==1;
        
    }
}