class Solution {
    private int square(int num){
        int sum_of_sq = 0;
        while(num!=0){
            sum_of_sq += (num%10)*(num%10);
            num/=10;
        }
        return sum_of_sq;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow!=fast);
        
        return slow==1;
    }
}