class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        int index = 0;
        
        for(int i: queries){
            int count = 0;
            for(int n : nums){
                if(i>=n){
                    i-=n;
                    count++;
                }else{
                    break;
                }
            }
            res[index++] = count;
        }
        return res;
    }
}

//We sort the nums array and iterate thru it

//We also initialise a counter to keep count of number of elements we're adding