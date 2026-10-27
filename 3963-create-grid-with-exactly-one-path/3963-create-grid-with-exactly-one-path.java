class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        Arrays.fill(res, 0, m-1, "." + "#".repeat(n-1));
        int j=1;
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        while(j<n){
            sb.append(".");
            j++;
        }
        res[m-1] = sb.toString();
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna