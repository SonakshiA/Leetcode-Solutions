class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int len = s.length();
        int i=0,j;

        while(i<len){
            int visited[] = new int[256]; //reinitialised everytime i changes since we now have a new window
            j=i;

            while(j<len && visited[s.charAt(j)]==0){
                max=Math.max(max,j-i+1);
                visited[s.charAt(j)]=1;
                j++;
            }

            //visited[s.charAt(i)]=0;
            i++;
        }
        return max;
    }
}