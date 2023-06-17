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
        return x + (target-1); //(suppose we have 4 as target and maxDoubles is 0, so we need 4-1 i.e 3 steps to get to 1)
    }
}

//start from the target and go to 1