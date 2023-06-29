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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while(list1!=null && list2!=null){
            if (list1.val<list2.val){
                ListNode newNode = new ListNode(list1.val);
                list1 = list1.next;
                tail.next = newNode;
            }else{
                ListNode newNode = new ListNode(list2.val);
                list2 = list2.next;
                tail.next = newNode;
            }
             tail = tail.next;
        }
        if(list1!=null){
            tail.next = list1;
        }
        if(list2!=null){
            tail.next = list2;
        }
        
        return dummy.next;
    }
}