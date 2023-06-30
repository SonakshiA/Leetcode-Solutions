class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        //make a map
        for(int i =0; i<chars.length();i++){
            map.put(chars.charAt(i),vals[i]);
        }
        
        int costMax = Integer.MIN_VALUE;
        int start = 0;
        int currSum = 0;
        for(int i =0 ;i<s.length(); i++){
            if(map.containsKey(s.charAt(i)))
                currSum+= map.get(s.charAt(i));
            else
                currSum+= s.charAt(i)-'a'+1;
            
            costMax = Math.max(currSum,costMax);
            
            if(currSum<0)
                currSum = 0;
        }
        return (costMax<0) ? 0 : costMax;
    }
}

//KADANES ALGORITHM