class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for(int num:arr){
            num%=k;
            if(num<0) num+=k;
            freq[num]++;
        }
        if(freq[0]%2==1) return false;
        
        for(int i=1;i<=k/2;i++){
            if(freq[i]!=freq[k-i])
                return false;
        }
        return true;
    }
}

/*

if a%k==x and b%k==k-x, (a+b) is divisible by k

1%5=1
9%5=4 and (5-1=4)

*/