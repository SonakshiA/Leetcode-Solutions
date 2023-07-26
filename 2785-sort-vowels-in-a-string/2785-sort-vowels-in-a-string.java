class Solution {
    public String sortVowels(String s) {
         List<Character> vowels = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' ||
                    s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                vowels.add(s.charAt(i));
                pos.add(i);
            }
        }
        Collections.sort(vowels);

        char[] ans = s.toCharArray();

        for(int i=0;i<pos.size();i++){
            ans[pos.get(i)] = vowels.get(i);
        }
        return new String(ans);
    }
}