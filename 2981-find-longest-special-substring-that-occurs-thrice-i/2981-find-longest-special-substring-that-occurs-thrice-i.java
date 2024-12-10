class Solution {
    public int maximumLength(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        
        int start = 0;
        
        while(start<s.length()){
            StringBuilder sb = new StringBuilder();
            int end = start;
            while(end<s.length()){
                if(sb.length()==0 || s.charAt(end)==sb.charAt(sb.length()-1)){
                    sb.append(s.charAt(end));
                 map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
                    end++;
                }else{
                    break;
                }
            }
            start++;
        }
        int ans = 0;
        for(String key: map.keySet()){
            if(map.get(key)>=3 && key.length()>ans){
                ans = key.length();
            }
        }
        return ans==0?-1:ans;
    }
}