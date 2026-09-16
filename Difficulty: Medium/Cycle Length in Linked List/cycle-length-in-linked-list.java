/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        Node slow=head,fast=head;
       
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            break;
        }
        
        if(fast==null || fast.next==null)
        return 0;
        
       
        
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
          
        }
        int count=1;
        while(slow.next!=fast)
        {
          count++;
          slow=slow.next;
        }
        return count;
    }
}