class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];

        for(int currBox=0;currBox<boxes.length();currBox++){
            if(boxes.charAt(currBox)=='1'){
                for(int newPos = 0; newPos<boxes.length();newPos++){
                    answer[newPos] += Math.abs(newPos-currBox);
                }
            }
        }
        return answer;
    }
}