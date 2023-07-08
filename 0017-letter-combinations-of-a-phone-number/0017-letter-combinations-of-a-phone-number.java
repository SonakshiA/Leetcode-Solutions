class Solution {
    List<String> combinations = new ArrayList<>();
    Map<Character,String> map = Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
    
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return combinations;
        String phoneDigits = digits;
        backtrack(new StringBuilder(),0,phoneDigits);
        return combinations;
        
    }
    
    private void backtrack(StringBuilder path, int index,String phoneDigits){
        if(path.length()==phoneDigits.length()){
            combinations.add(path.toString());
            return;
        }
        String allLetters = map.get(phoneDigits.charAt(index));
        for(Character ch: allLetters.toCharArray()){
            path.append(ch);
            backtrack(path,index+1,phoneDigits);
            //delete the last added character to go to previous level of recursion
            path.deleteCharAt(path.length()-1);
        }
    }
}

/*

a - ad,ae,af
b - bd,be,bf
c - cd,ce,cf

*/