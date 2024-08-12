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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode current = head;
        
        while(current!=null){
            length++;
            current = current.next;
        }
        
        int mid = length/2;
        
        current = head;
        
        while(mid!=0){
            current = current.next;
            mid--;
        }
        return current;
    }
}