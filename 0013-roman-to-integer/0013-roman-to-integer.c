int romanToInt(char *s){
    int i=0;
    int sum=0;

    while(s[i]!='\0'){
        switch(s[i]){
            case 'I':
                if(s[i+1]=='V'){
                    sum+=4;
                    i=i+2;
                }
                else if(s[i+1]=='X'){
                    sum+=9;
                    i=i+2;
                }else{
                    sum+=1;
                    i++;
                }
                break;
            
            case 'V':
                sum += 5;
                i++;
                break;
            
            case 'X':
                if(s[i+1]=='L'){
                    sum += 40;
                    i = i+2;
                }

                else if(s[i+1]=='C'){
                    sum += 90;
                    i = i+2;
                }
                else{
                    sum += 10;
                    i++;
                }

                break;

            case 'L':
                sum += 50;
                i++;
                break;
            
            case 'C':
                if(s[i+1]=='D'){
                    sum += 400;
                    i = i+2;
                }

                else if(s[i+1]=='M'){
                    sum += 900;
                    i = i+2;
                }
                else{
                    sum += 100;
                    i++;
                }

                break;

            case 'D':
                sum += 500;
                i++;
                break;
            
            case 'M':
                sum += 1000;
                i++;
                break;

        }
    }
    return sum;
}