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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode result = head;
        while(result!=null && result.val==val)
            result = result.next;
        
        if(result==null)
            return null;
        
        ListNode runner = result;
        while(runner.next!=null){
            if(runner.next.val==val){
                runner.next = runner.next.next;
            }else{
                runner = runner.next;
            }
        }
        return result;
    }
}