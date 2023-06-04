class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        
        int[] prefix_sum = new int[n];
        int[] candle_left =  new int[n];
        int[] candle_right = new int[n];
        
        prefix_sum[0] = s.charAt(0) == '*' ? 1: 0;
        candle_left[0] = s.charAt(0) == '|' ? 0: -1;
        
        for(int i =1;i<n;++i){
            prefix_sum[i] = prefix_sum[i-1] + (s.charAt(i)=='*' ? 1: 0);
            candle_left[i] = s.charAt(i) == '|' ? i : candle_left[i-1];
        }
        
        candle_right[n-1] = s.charAt(n-1) == '|' ? n-1: n;
        
        for(int i = n-2; i>=0; --i){
            candle_right[i] = s.charAt(i) == '|' ? i : candle_right[i+1];
        }
        
        int[] result = new int[queries.length];
        
        for(int i = 0; i<queries.length; ++i){
            int start = candle_right[queries[i][0]];
            int end = candle_left[queries[i][1]];
            
            result[i] = start>=end ? 0 : prefix_sum[end] - prefix_sum[start];
        }
        
        return result;
    }
}