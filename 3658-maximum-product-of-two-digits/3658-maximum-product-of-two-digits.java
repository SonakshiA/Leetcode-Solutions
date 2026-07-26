class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        while(n>0) {
            int rem = n%10;
            l.add(rem);
            n = n/10;
        }
        int len = l.size();
        Collections.sort(l);
        return l.get(len-1) * l.get(len-2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna