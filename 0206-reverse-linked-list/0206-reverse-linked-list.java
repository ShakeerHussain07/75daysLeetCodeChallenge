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
    public ListNode reverseList(ListNode head) {
        return reverseLoop(head);
    }
    public ListNode reverseRecursion(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode cr=head.next;
        head.next=null;
        ListNode newHead=reverseRecursion(cr);
        cr.next=head;
        return newHead;
    }
    public ListNode reverseLoop(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode prev=null,cr=head,next=head.next;

        while(cr!=null){
            next=cr.next;
            cr.next=prev;
            prev=cr;
            cr=next;
        }
        return prev;
    }
}