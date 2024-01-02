class Solution {
    public int sumOfDigits(int n){
        if(n<=9) return n;
        int sum = 0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int sumDig = sumOfDigits(i);
            map.put(sumDig, map.getOrDefault(sumDig,0)+1);
        }
        int max = 0;
        for(Integer v:map.values()){
            if(v>max)
                max=v;
        }
        return max;
    }
}