class Solution {
    public boolean checkDivisibility(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        int num = n;
        while(n > 0) {
            int digit = n%10;
            digits.add(digit);
            n = n/10;
        }

        int sum = 0;
        int prod = 1;

        for(int d: digits) {
            sum += d;
            prod*= d;
        }

        int divisor = sum + prod;

        return (num % divisor == 0) ? true: false;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna