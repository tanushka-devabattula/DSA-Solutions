/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    } 
    ............................................................................................................................................................................................................................................................................................................................................
}
*/
class Solution {
    public Node reverse(Node head) {
      Node last=null,current=head;
      while(current!=null)
      {
          last=current.prev;
          current.prev=current.next;
          current.next=last;
          last=current;
          current=current.prev;
      }
    
     return last;
    }
}