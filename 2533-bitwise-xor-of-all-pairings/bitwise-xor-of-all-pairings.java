class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num:nums1){
            freq.put(num, freq.getOrDefault(num,0)+len2);
        }

        for(int num:nums2){
            freq.put(num, freq.getOrDefault(num,0)+len1);
        }

        int ans = 0;
        for(Integer key: freq.keySet()){
            if(freq.get(key)%2==1){
                ans^=key;
            }
        }
        return ans;
    }
}

/*
[a1,a2] and [b1,b2,b3]:

=(a1^b1) ^ (a1^b2) ^ (a1^b3) ^ (a2^b1) ^ (a2^b2) ^ (a2^b3)
=a1^a1^a1^a2^a2^a2&b1^b1^b2^b2^b3^b3
(a1^ .... repeated len2 times) ^ (a2^... repeated len2 times) ^
(b1^...repeated len1 times) ^ (b2^...repeated len1 times) ^ (b3^...repeated len1 times)


a1^a1 = 0 (if even times then 0)
a1^a1^a1 = 0^a1 = a1 (if odd times then answer itself)

*/