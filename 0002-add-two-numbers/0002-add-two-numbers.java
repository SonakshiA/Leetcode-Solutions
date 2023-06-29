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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        
        while(l1!=null || l2!=null || carry!=0){ //somtimes, l1, l2 maybe null but we may have a carry
            int d1 = (l1==null) ? 0 :l1.val;
            int d2 = (l2==null) ? 0 : l2.val;
            
            int sum = d1 + d2 + carry;
            int digit = sum%10;
            carry = sum/10;
            
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next; 
            
            l1 = (l1!=null) ? l1.next : null;
            l2 = (l2!=null) ? l2.next : null;
        }
        
        ListNode res = dummy.next;
        return res;
    }
}