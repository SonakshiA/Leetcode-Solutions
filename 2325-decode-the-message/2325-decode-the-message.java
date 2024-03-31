class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        char ch = 'a';
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' ' && !map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),ch);
                ch++;
            }else{
                continue;
            }
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' ')
                sb.append(message.charAt(i));
            else{
                sb.append(map.get(message.charAt(i)));
            }
        }
        return sb.toString();
    }
}