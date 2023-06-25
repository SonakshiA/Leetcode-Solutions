class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> left = new HashMap<>(), 
        right = new HashMap<>(), 
        count = new HashMap<>();
        int ans = nums.length;
        
        for(int i = 0 ;i<nums.length; i++){
            int num = nums[i];
            
            //store first occurence of num
            if(left.get(num)==null)
                left.put(num,i);
            
            right.put(num,i); //always update since we need last occurence of num
            
            count.put(num,count.getOrDefault(num,0)+1);
        }
        
        int degree = Collections.max(count.values());
        
        for(int key:count.keySet()){
            if(count.get(key)==degree)
                ans = Math.min(ans,right.get(key) - left.get(key) + 1);
        }
        
        return ans;
    }
}

/*

Intuition :  we store the first and last occurence of each number

An array that has degree d, must have some element x occur d times. If some subarray has the same degree, then some element x (that occured d times), still occurs d times. The shortest such subarray would be from the first occurrence of x until the last occurrence.

For each element in the given array, let's know left, the index of its first occurrence; and right, the index of its last occurrence. For example, with nums = [1,2,3,2,5] we have left[2] = 1 and right[2] = 3.

Then, for each element x that occurs the maximum number of times, right[x] - left[x] + 1 will be our candidate answer, and we'll take the minimum of those candidates.

*/