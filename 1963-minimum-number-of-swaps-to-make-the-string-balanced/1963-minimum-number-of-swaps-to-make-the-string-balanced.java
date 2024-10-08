class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        int unmatched = 0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch=='['){
                stack.push(ch);
            }else{
                if(!stack.isEmpty())
                    stack.pop();
                else
                    unmatched++;
            }
        }
        return (unmatched+1)/2;
    }
}