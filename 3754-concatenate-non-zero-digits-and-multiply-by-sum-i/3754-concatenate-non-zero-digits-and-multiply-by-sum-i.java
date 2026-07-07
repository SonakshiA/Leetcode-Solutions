class Solution {
    public long sumAndMultiply(int n) {
       if (n==0) return 0;
       String num = String.valueOf(n);
       char[] num_arr = num.toCharArray(); 
       StringBuilder sb = new StringBuilder();
       long sum = 0;

       for(char ch: num_arr) {
            if(ch!='0')
                sb.append(ch);
            sum += Character.getNumericValue(ch);
       }

       long number = Long.valueOf(sb.toString());
       return number * sum;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna