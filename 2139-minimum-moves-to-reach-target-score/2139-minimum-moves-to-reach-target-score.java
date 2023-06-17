class Solution {
    public int minMoves(int target, int maxDoubles) {
        int x = 0;
        while(target > 1 && maxDoubles>0){
            if(target%2==0){
                maxDoubles--;
                target/=2;
                x++;
            }else{
                x++;
                target-=1;
            }
        }
        return x + (target-1);
    }
}

//start from the target and go to 1