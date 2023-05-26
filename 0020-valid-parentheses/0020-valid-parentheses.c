#define SIZE 10000

char stack[SIZE];
int top = -1;

void push(char c){
    if(top==SIZE-1){
        exit(1);
    }
    stack[++top] = c;
}

char pop(){
    if(top==-1){
        exit(1);
    }
    return stack[top--];
}

char peek(){
    if(top==-1){
        exit(1);
    }
    return stack[top];
}

int matches(char left, char right){
    bool match=false;
    switch(left){
        case '(':
            if(right==')') match=true;
            break;
        
        case '{':
            if(right=='}') match=true;
            break;
        
        case '[':
            if(right==']') match=true;
            break;
    }
    return match;
}

bool isValid(char * s){
   int i=0;
   bool error=1;
   while(s[i]!='\0'){
        if(s[i]=='(' || s[i]=='{' || s[i]=='['){
            push(s[i]);
        }
        else if(s[i]==')' || s[i]=='}' || s[i]==']'){
            if(top==-1){
                error=0;
                break;
            }else if(matches(peek(),s[i])){
                pop();
            }else{
                error=0;
                break;
            }
        }
        ++i;
   }

   if(error==1 && top!=-1) error= 0;
   if(error==0) top=-1;
   return error;

}