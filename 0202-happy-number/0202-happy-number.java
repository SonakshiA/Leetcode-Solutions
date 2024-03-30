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
       HashSet<Integer> set = new HashSet<>();
        while(true){
            n = square(n);
            if(n==1)
                return true;
            else if(set.contains(n))
                return false;
            set.add(n);
        }
    }
}