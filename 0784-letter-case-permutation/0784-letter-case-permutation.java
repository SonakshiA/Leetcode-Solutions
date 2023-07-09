class Solution {
    private void casePermutation(int index,char[] letters, String s,List<String> res){
        if(index==s.length()){
            String str = new String();  
            if(!res.contains(str.valueOf(letters)))
                res.add(str.valueOf(letters));
            return;
        }
        if(Character.isLetter(letters[index]))
            letters[index] = Character.toUpperCase(letters[index]);
        
        casePermutation(index+1,letters,s,res);
        
        if(Character.isLetter(letters[index]))
            letters[index] = Character.toLowerCase(letters[index]);
        
        casePermutation(index+1,letters,s,res);
        
    }
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        char[] letters = s.toLowerCase().toCharArray();
        casePermutation(0,letters,s,res);
        
        return res;
    }
}