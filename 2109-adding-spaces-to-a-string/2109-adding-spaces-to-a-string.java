class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for(int space: spaces){
            sb.append(s.substring(start,space));
            sb.append(" ");
            start = space;
        }
        sb.append(s.substring(start,s.length()));
        return sb.toString();
    }
}