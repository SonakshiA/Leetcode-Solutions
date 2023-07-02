class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int res[] = new int[num_people];
        int toBeGiven = 1;
        int i = 0;
        while(candies>0){
            if(candies-toBeGiven>=0){
                res[i] += toBeGiven;
                candies-=toBeGiven;
                toBeGiven++;
                i = (++i)%num_people;
            }else{
                res[i] += candies;
                break;
            }
        }
        return res;
    }
}