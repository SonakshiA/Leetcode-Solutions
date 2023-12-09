class Solution {
    public int romanToInt(String s) {
        
        int len = s.length();
        int i=0;
        int sum = 0;
        
        while(i<len){
            switch(s.charAt(i)){
                case 'I':
                    if(i+1!=len && s.charAt(i+1)=='V'){
                        sum+=4;
                        i=i+2; 
                    }
                    else if(i+1!=len && s.charAt(i+1)=='X'){
                        sum+=9;
                        i=i+2;
                    }
                    else{
                        sum+=1;
                        i++;
                    }
                    break;
                    
                case 'X':
                    if(i+1!=len && s.charAt(i+1)=='L'){
                        sum+=40;
                        i=i+2;
                    }
                    else if(i+1!=len && s.charAt(i+1)=='C'){
                        sum+=90;
                        i=i+2;
                    }
                    else{
                        sum+=10;
                        i++;
                    }
                    break;
                    
                case 'C':
                    if(i+1!=len && s.charAt(i+1)=='D'){
                        sum+= 400;
                        i=i+2;
                    }
                    else if(i+1!=len && s.charAt(i+1)=='M'){
                        sum+=900;
                        i=i+2;
                    }
                    else{
                        sum+=100;
                        i++;
                    }
                    break;
                    
                case 'V':
                    sum+=5;
                    i++;
                    break;
                    
                case 'L':
                    sum+=50;
                    i++;
                    break;
                    
                case 'D':
                    sum+=500;
                    i++;
                    break;
                    
                case 'M':
                    sum+=1000;
                    i++;
                    break;
            }
        }
        return sum;
    }
}