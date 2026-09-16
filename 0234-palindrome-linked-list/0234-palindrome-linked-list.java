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
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null,cur=head;
        while(cur!=null)
        {
            ListNode Next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=Next;
        
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head,temp=head;
      while(fast!=null && fast.next!=null)
      {
        
         slow=slow.next;
         fast=fast.next.next;
      }
     temp= reverse(slow);
     
      while(temp!=null)
      {
        if(head.val!=temp.val)
        return false;
        head=head.next;
        temp=temp.next;

      }

        return true;
    }
}