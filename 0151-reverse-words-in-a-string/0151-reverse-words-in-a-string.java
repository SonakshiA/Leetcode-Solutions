class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));

        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1; i>=0; i--){
            if(!words[i].equals("")){
                sb.append(words[i] + " ");
            }
        }
        return sb.toString().trim();
    }
}