class Solution {
    public boolean canBeValid(String s, String locked) {
        //an odd length string can never be balanced
        if (s.length()%2==1)
            return false;
        
        Stack<Integer> openBrackets = new Stack<>();
        Stack<Integer> unlockedBrackets = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'){
                unlockedBrackets.push(i);
            } else if (s.charAt(i)=='('){
                openBrackets.push(i);
            } else if (s.charAt(i)==')'){
                if(!openBrackets.isEmpty()){
                    openBrackets.pop();
                }else if(!unlockedBrackets.isEmpty()){
                    unlockedBrackets.pop();
                }else{
                    return false;
                }
            }
        }

        //remaining open brackets to be matched. The closed bracket should come after the open bracket
        while(!openBrackets.isEmpty() && !unlockedBrackets.isEmpty() 
        && openBrackets.peek()<unlockedBrackets.peek()){
            openBrackets.pop();
            unlockedBrackets.pop();
        }

        if(!openBrackets.isEmpty()){
            return false;
        }
        return true;
    }
}