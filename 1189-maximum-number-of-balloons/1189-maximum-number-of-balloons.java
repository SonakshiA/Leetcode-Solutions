class Solution {
    public int maxNumberOfBalloons(String text) {
          Map<Character, Integer> m = new HashMap<>();
        int min_freq = Integer.MAX_VALUE;
        char[] ballon = {'b','a','l','o','n'};
            
        for(char ch : text.toCharArray())
        {   
            // Set the number of each character as 0 by default
            m.put(ch, m.getOrDefault(ch, 0)+1);
        }
        
        for(char ch : ballon)
        {  
            if(m.get(ch) == null)
                return 0;
            
            // There are 2 special characters appearing twice in balloon, which are l & o.
            if(ch == 'o' || ch == 'l')
            {
                min_freq = Math.min(min_freq, m.get(ch) / 2);
            }
            else
            {
                min_freq = Math.min(min_freq, m.get(ch));
            }
        }
        return min_freq;
    
    }
}