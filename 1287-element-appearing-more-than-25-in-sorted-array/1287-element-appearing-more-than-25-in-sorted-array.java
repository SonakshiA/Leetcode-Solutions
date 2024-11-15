class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int x:arr){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        System.out.println(freq);
        int thresh = (int) (0.25*n);
        System.out.println(thresh);
        int ans = 0;
        for(Integer key: freq.keySet()){
            if(freq.get(key)>thresh){
                ans = key;
            }
        }
        return ans;
    }
}