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
    
    private int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode n1 = head;
        ListNode n2 = head.next;
        
        while(n2!=null){
            int gcdValue = gcd(n1.val,n2.val);
            ListNode gcdNode = new ListNode(gcdValue);
            
            n1.next = gcdNode;
            gcdNode.next = n2;
            n1 = n2;
            n2 = n2.next;
        }
        return head;
    }
}