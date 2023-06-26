class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        map.put(0,-1); //incase first element is divisible by k
        boolean found= false;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            int hash = sum%k;
            if(map.containsKey(hash)){
                int diff = i - map.get(hash);
                if(diff>=2){
                    found = true;
                    break;
                }
            }else{
                map.put(hash,i);
            }
        }
        return found;
    }
}

/*

[23]

23 % 6 = 5

[23,2,4]

29%6 = 5 (5 is already in hashmap)

so 2,4 are divisible by k

HASHMAP has remainder and index i 

*/