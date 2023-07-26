class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for(String word: words){
           int start = 0;
           while(start<word.length()){
               int end = start;
               while(end<word.length() && word.charAt(end)!=separator){
                   end++;
               }
               if(!word.substring(start,end).isEmpty()) {
                   res.add(word.substring(start, end));
               }
               start = end+1;
           }
        }
        System.out.println(res);
        return res;
    }
}