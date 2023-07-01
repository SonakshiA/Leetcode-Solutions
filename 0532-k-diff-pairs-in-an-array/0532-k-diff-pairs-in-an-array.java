class Solution {
    public int findPairs(int[] nums, int k) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int num: nums){
            if(map.containsKey(num+k)){
                if(num+k == num){
                    if(map.get(num+k)>1){  //when k is 0 
                        res++;
                        map.put(num+k,0);  //we've used this pair
                    }
                }else if (map.get(num+k)>0){
                    res++;
                    map.put(num+k,0); 
                }
            }
        }
        
        return res;
    }
}

/*

Strategy:

Add the numbers with their occurences in a hm

1:2
3:1
4:1
5:1

Then for each num, do num+k and check if num+k exists
if exists, check if its occurence is >0

*/