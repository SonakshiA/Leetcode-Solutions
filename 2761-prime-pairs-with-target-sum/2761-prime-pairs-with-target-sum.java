class Solution {
    private boolean isPrime(int num){
        int x=2;
        int y=(int)Math.sqrt(num);
        while(x<=y){
            if(num%x==0){
                return false;
            }
            x++;
        }
        return true;
        
    }
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> res = new ArrayList<>();
        
        int x=2;
        while(x<=(n/2)){
            if(isPrime(x)){
                if(isPrime(n-x)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(x);
                    temp.add(n-x);
                    Collections.sort(temp);
                    res.add(temp);
                }
            }
            x++;
        }
        return res;
    }
}