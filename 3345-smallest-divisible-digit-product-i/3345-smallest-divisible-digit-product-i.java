class Solution {
    private int findProd(int n) {
        int prod = 1;
        while(n>0) {
            int rem = n%10;
            prod = prod * rem;
            n = n/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        while(findProd(n) % t !=0) {
            n = n+1;
        }
        return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna