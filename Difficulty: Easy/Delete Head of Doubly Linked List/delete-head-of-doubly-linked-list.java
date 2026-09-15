/* Structure of doubly linked list Node
class Node {
public:
    int data;
    Node next;
    Node prev;

    public Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
};*/
class Solution {
    public Node deleteHead(Node head) {
     Node temp=head;
     head=head.next;
     temp.next=null;
     head.prev=null;
     return head;
    }
};