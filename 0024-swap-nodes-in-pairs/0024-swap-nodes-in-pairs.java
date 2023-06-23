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
    public ListNode swapPairs(ListNode head) {
        ListNode fakeNode = new ListNode(-1);
        fakeNode.next = head;
        ListNode node = fakeNode;
        
        while(node!=null && node.next!=null && node.next.next!=null){
            ListNode first = node;
            ListNode second = node.next;
            ListNode third = node.next.next;
            
            first.next = third;
            second.next = third.next;
            third.next = second;
            
            node = second;
        }
        
        return fakeNode.next;
    }
}