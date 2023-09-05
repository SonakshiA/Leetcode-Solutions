class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        if(n==0 || n<k) return 0;
        if(k<=1) return n;
        
        int[] map = new int[26];
        
        for(int  i= 0; i<n ;i++){
            map[s.charAt(i)-'a']++;
        }
        
        int l=0;
        //iterate till we find a character having occurence less than k
        while(l<n && map[s.charAt(l)-'a']>=k) l++; 
        
        //if entire substring is traversed and all characters are greater than k or the last character has occurence less than k
        if(l>=n-1) return l;
        
        int ls1 = longestSubstring(s.substring(0,l),k);
        
        //if characters next to l also have occurence less than k
        while(l<n && map[s.charAt(l)-'a']<k) l++;
        
        int ls2 = longestSubstring(s.substring(l),k);
        return Math.max(ls1,ls2);
    }
}

//USES Divide and Conquer