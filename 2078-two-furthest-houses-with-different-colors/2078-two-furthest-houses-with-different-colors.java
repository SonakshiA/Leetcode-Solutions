class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;

        while(colors[i]==colors[j]){
            j--;
        }

        int opt1 = j - i;

        i=0;
        j=colors.length-1;

        while(colors[i]==colors[j]){
            i++;
        }

        int opt2 = j - i;

        return Math.max(opt1,opt2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna