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
        ListNode fast=head,slow=head,temp=head;
        if(head==null || head.next==null)
        return null;
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}