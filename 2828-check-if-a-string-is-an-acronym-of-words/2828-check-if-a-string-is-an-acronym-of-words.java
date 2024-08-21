class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String acr = "";
        for(String w: words){
            acr+=w.charAt(0);
        }
        
        return s.equals(acr);
    }
}