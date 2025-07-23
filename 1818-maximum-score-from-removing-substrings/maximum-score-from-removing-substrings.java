class Solution {
    public int maximumGain(String s, int x, int y) {
        int totalScore = 0;
        String highPriority = x > y ? "ab": "ba";
        String lowPriority = highPriority.equals("ab") ? "ba": "ab";

        //first pass
        String firstPassResult = removeSubString(s, highPriority);
        int pairsRemoved = (s.length() - firstPassResult.length())/2;
        totalScore += pairsRemoved * Math.max(x,y);

        //second pass
        String secondPassResult = removeSubString(firstPassResult, lowPriority);
        pairsRemoved = (firstPassResult.length() - secondPassResult.length())/2;
        totalScore += pairsRemoved * Math.min(x,y);

        return totalScore;
    }

    private String removeSubString(String str, String target) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);

            if(!stack.isEmpty() && currChar == target.charAt(1) 
            && stack.peek() == target.charAt(0)) {
                stack.pop();
            } else {
                stack.push(currChar);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}