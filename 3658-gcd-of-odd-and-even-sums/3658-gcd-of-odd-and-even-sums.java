class Solution {
    private int findGcd(int n1, int n2) {
        int min = Math.min(n1,n2);

        for(int i=min;i>=0;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return 1;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 1;
        int sumEven = 2;

        int[] even = new int[n];
        int[] odd = new int[n];

        odd[0] = sumOdd;
        even[0] = sumEven;

        for(int i=1;i<n;i++){
            sumOdd+=2;
            sumEven+=2;
            odd[i] = sumOdd;
            even[i] = sumEven;
        }
        sumOdd = 0;
        sumEven = 0;
        for(int x:odd) {
            sumOdd += x;
        }
        for(int x:even) {
            sumEven += x;
        }
        return findGcd(sumOdd, sumEven);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna