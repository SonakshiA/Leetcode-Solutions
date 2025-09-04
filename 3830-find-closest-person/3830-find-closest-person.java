class Solution {
    public int findClosest(int x, int y, int z) {
        int distanceBetweenXAndZ = Math.abs(x-z);
        int distanceBetweenYAndZ = Math.abs(y-z);

        if(distanceBetweenXAndZ<distanceBetweenYAndZ){
            return 1;
        }
        else if(distanceBetweenXAndZ>distanceBetweenYAndZ){
            return 2;
        }
        return 0;
    }
}