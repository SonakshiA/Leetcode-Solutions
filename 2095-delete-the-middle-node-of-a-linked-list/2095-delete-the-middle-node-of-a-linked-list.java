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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode curr = head;
        
        //finding the middle node
        if(head==null || head.next==null){
            return null;
        }
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //after the loop, slow pointer sits at the middle node
        
        //reaching to the node before the middle node
        while(curr.next!=slow){
            curr = curr.next;
        }
        
        curr.next = slow.next;
        
        return head;
    }
}

//find the node before the middle node
//needs two pointer approach