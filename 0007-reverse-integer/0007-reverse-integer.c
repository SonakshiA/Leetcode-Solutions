int reverse(int x){
    int copy,rem;
    long rev=0;
    copy=x;

    while(x!=0){
        rem = x%10;
        rev = rev*10 + rem;
        x/=10;
    }

    return (rev>INT_MAX || rev<INT_MIN) ? 0:rev;
}