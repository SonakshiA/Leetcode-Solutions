class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        
        
        int maxLen = 0;
        for(String w: words)
            if(w.length()>maxLen)
                maxLen = w.length();
        
        char[][] letters = new char[words.length][maxLen]; //jagged array
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                letters[i][j] = words[i].charAt(j);
            }
        }
        
        List<String> res = new ArrayList<>();
        
        for(int col=0;col<maxLen;col++){
            StringBuilder sb = new StringBuilder();
            for(int row=0;row<words.length;row++){
                if(letters[row][col]!=Character.MIN_VALUE)
                    sb.append(letters[row][col]);
                else
                    sb.append(" ");
            
            }
            res.add(sb.toString().stripTrailing());
        }
        return res;
    }
}

//CONTEST
//IS
//COMING

//CIC OSO N M T I E N S G T