class Solution {
    public int alternateDigitSum(int n) {
        int res = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        int prod = 1;

        while(n>0){
            int rem = n%10;
            digits.add(rem);
            n/=10;
        }

        Collections.reverse(digits);

        for(int d: digits){
            res += (d*prod);
            prod = prod*(-1);
        }

        return res;
    }
}