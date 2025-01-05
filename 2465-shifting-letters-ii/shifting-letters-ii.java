class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diffArray = new int[n+1];

        for(int[] shift: shifts){
            if(shift[2]==1){
                diffArray[shift[0]]++;
                diffArray[shift[1]+1]--;
            }else{
                diffArray[shift[0]]--;
                diffArray[shift[1]+1]++;
            }
        }

        //actual array
        for(int i=1;i<=n;i++){
            diffArray[i] += diffArray[i-1];
        }

        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            int count = diffArray[i]%26;
            if(count<0){ //if negative then convert to positive
                count+=26;
            }

            char currChar = (char) ((s.charAt(i)-'a' + count)%26 + 97);
            res.append(currChar);
        }
        return res.toString();
    }
}

/*

to convert decrement into increment:

(k%26)+26

a-1 = z
a+25 = z
*/