class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int inCar = 0;
        int[] inc = new int[1001];
        
        for(int i= 0; i<trips.length;i++){
            inc[trips[i][1]] += trips[i][0];  //for starting of trip, add number of passengers
            inc[trips[i][2]] -= trips[i][0]; //add ending, decrease the passengers
        }
        
        for(int i = 0; i<=1000; i++){
            inCar += inc[i];
            
            if(inCar>capacity) return false;
        }
        return true;
    }
}

/*
Refer: https://leetcode.com/problems/car-pooling/discuss/1670309/C%2B%2BJavaPython-DONOT-SORT-oror-O(N)-95-Faster-oror-Image-Explanation

*/