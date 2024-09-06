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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s = new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        
        ArrayList<Integer> l = new ArrayList<>();
        
        while(head!=null){
            if(!s.contains(head.val)){
                l.add(head.val);
            }
            head=head.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        for(int i=0;i<l.size();i++){
            tail.next = new ListNode(l.get(i));
            tail=tail.next;
        }
        return dummy.next;
    }
}