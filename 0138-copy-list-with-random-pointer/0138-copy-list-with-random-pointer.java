/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        return null;
        Node temp=head;
        while(temp!=null)
        {
            Node newnode=new Node(temp.val);
            newnode.next=temp.next;
            temp.next=newnode ;
            temp=newnode.next;

        }

        temp=head;
        while(temp!=null)
        {
            if(temp.random==null)
           temp.next.random=null;
            else
           temp.next.random=temp.random.next;
            temp=temp.next.next;
            
        }
       temp=head;
        Node cloneHead = head.next;
        Node current=temp.next;

        while(current.next!=null)
        {
              temp.next=current.next;
           current.next=current.next.next;
           temp=temp.next;
           current=current.next;
         
          
        }
       temp.next=null;
        return cloneHead;
        
    }
}