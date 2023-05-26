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
    
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;
        
        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    
    
    private ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null){
            return;
        }
        
        ListNode mid = middle(head);
        ListNode k = reverse(mid.next);
        
        ListNode c1 = head;
        ListNode c2 = k;
        ListNode f1 = null;
        ListNode f2 = null;
        mid.next = null; //to split the list into two lists
        
        while(c1!=null && c2!=null){
            f1 = c1.next;
            f2 = c2.next;
            c1.next = c2;
            c2.next = f1;
            c1 = f1;
            c2 = f2;
        }
    }
}

/*

Divide the list into two halves
Reverse the second half list

Let A and B be the two lists.
Connect A0->B0->A1->B1-> ....so on
*/