class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0, cookies = 0;
        
        for(int i=0; i<g.length && cookies<s.length;){
            if(s[cookies]>=g[i]){
                i++;
                count++;
            }
            cookies++;
        }
        return count;
    }
}