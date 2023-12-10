class Solution {
    public String intToRoman(int num) {
        String[] M = {"","M","MM","MMM"}; //1000-3000
        String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; //100,900
        String[] X = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}; //10-90
        String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"}; //1-9
        
        List<Integer> digits = new ArrayList<>();
        
        while(num>0){
            int rem = num%10;
            digits.add(rem);
            num/=10;
        }
        
        Collections.reverse(digits);
        
        StringBuilder sb = new StringBuilder();
        int power = digits.size()-1;
        
        for(int i=0;i<digits.size();i++){
            int dig = digits.get(i);
            int actual = (int) (Math.pow(10,power)*dig);
            
            if(actual>=1 && actual<=9){
                sb.append(I[dig]);
            }else if(actual>=10 && actual<=90){
                sb.append(X[dig]);
            }else if(actual>=100 && actual<=900){
                sb.append(C[dig]);
            }else{
                sb.append(M[dig]);
            } 
            power--;
        }
        return sb.toString();
    }
}