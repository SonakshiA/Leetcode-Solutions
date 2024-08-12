/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ListNode current = head;
        
        while(current!=null){
            values.add(current.val);
            current = current.next;
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        int n = values.size();
        
        for(int i=0;i<n/2;i++){
            int sum = values.get(i) + values.get(n-i-1);
            maxSum =    Math.max(sum,maxSum);
        }
        return maxSum;
    }
}