class Solution {
    public int minTimeToType(String word) {
        char curr = 'a';
        char[] characters = word.toCharArray();
        int pressing_time = word.length();
        int movement_time = 0;
        
        for(char c: characters){
            if(c!=curr){
                movement_time += Math.min((26-Math.abs(c-curr)),Math.abs(c-curr));
                curr = c;
            } 
        }
        System.out.println(movement_time);
        return movement_time + pressing_time;
    }
}