class Solution {
    public int getSum(int a, int b) {
        if(b==0) return a;
        int sum = a^b;
        int carry = (a&b)<<1;
        return getSum(sum,carry);
    }
}

/*
a = 9
b = 11

     1001
     1011
     ----
     0010  <- a^b
    10010  <- (a&b)<<1
    -----
    10000
    00100 
    -----
    10100 
    00000 <- stop as all 0s, return a
*/