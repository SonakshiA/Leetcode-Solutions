class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length<=1)
            return intervals;
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        List<int[]> output_array = new ArrayList<>();
        int[] current_interval = intervals[0];
        output_array.add(current_interval);
        
        for(int[] interval: intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            
            if(current_end>=next_begin){
                //modifies in the output array itself
                current_interval[1] = Math.max(current_end,next_end);
            }else{
                //change the current_interval from intervals[0] to new interval
                current_interval = interval;
                output_array.add(current_interval);
            }
        }
        
        return output_array.toArray(new int[output_array.size()][]);
    }
}
/* Refer: https://www.youtube.com/watch?v=qKczfGUrFY4 */