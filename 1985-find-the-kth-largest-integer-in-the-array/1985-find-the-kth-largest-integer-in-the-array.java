import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>(Comparator.reverseOrder());
        String ans = "";
        for(String num:nums){
            BigInteger n = new BigInteger(num);
            pq.add(n);
        }
        
        while(k>0){
            ans=String.valueOf(pq.poll());
            k--;
        }
        return ans;
    }
}