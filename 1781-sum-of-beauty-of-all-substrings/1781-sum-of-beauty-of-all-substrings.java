class Solution {
    private int findMax(int[] charCount){
        int max = 0;
        for(int i = 0 ;i<26; i++){
            max = Math.max(max,charCount[i]);
        }
        return max;
    }
    
    private int findMin(int[] charCount){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ;i<26; i++){
            if(charCount[i]!=0)
                min = Math.min(min,charCount[i]);
        }
        return min;
    }
    
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            int[] map = new int[26];
            
            for(int j = i ;j <s.length(); j++){
                ++map[s.charAt(j)-'a'];
                
                sum += findMax(map) - findMin(map);
            }
        }
        return sum;
    }
}