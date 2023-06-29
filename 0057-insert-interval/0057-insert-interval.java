class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int[][] newArray = Arrays.copyOf(intervals,intervals.length+1);
        newArray[intervals.length] = newInterval;
        Arrays.sort(newArray,(a,b) -> a[0]-b[0]);
        
        List<int[]> output_arr = new ArrayList<>();
        int[] current_interval = newArray[0];
        output_arr.add(current_interval);
        
        for(int[] interval: newArray){
            int current_begin = current_interval[0];
            int current_end =  current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            
            if(current_end>=next_begin){
                //changes in output_arr too
                current_interval[1] = Math.max(current_end,next_end);
            }else{
                current_interval = interval;
                output_arr.add(current_interval);
            }
        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }
}

/*

add new interval to intervals and use merged interval question technique 

*/