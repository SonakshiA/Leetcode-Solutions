class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int forward = 0;
        int backward = 0;
        int n = words.length;
        int i = startIndex;
        
        if(!Arrays.asList(words).contains(target))
            return -1;
        
        while(!words[i].equals(target)){
            forward++;
            i=(i+1)%n;
        }
        
        i=startIndex;
        
        while(!words[i].equals(target)){
            backward++;
            i=(i-1+n)%n;
        }
        
        return Math.min(forward,backward);
    }
}