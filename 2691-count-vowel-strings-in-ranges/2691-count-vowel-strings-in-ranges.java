class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixSum = new int[words.length];
        int[] ans = new int[queries.length];
        int sum = 0;
        //to check if a word starts and ends with a vowel
        HashSet<Character> vowels = new HashSet<>();
        char[] v = {'a','e','i','o','u'};
        for(char ch: v){
            vowels.add(ch);
        }
        System.out.println(vowels);

        for(int i=0;i<words.length;i++){
            String currentWord = words[i];

            if(vowels.contains(currentWord.charAt(0)) && 
                vowels.contains(currentWord.charAt(currentWord.length()-1))){
                    sum++;
            }
            prefixSum[i] = sum;
        }

        for(int i=0;i<queries.length;i++){
            int[] currQuery = queries[i];
            ans[i] = prefixSum[currQuery[1]] - (currQuery[0] == 0 ? 0:prefixSum[currQuery[0]-1]);
        }
        return ans;
    }
}