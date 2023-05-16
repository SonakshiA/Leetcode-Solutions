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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head==null){
            return null;
        }
        
        int length = 0;
        ListNode current = head;
        
        while(current!=null){
            length = length+1;
            current = current.next;
        }
        
        int targetFromFront = length - n;
        
        if (targetFromFront == 0){ // [1,2],  n=2
            current = head.next;
            head = null;
            return current;
        }
        
        
        int count = 1;
        current = head;
        
        while(count!=targetFromFront){
            current = current.next;
            count++;
        }
        
        current.next = current.next.next;
        
        return head;
    }
}