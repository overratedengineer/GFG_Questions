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
       if(head.next==null||head==null){
           return null;
       }
       head.next.prev=null;
       head=head.next;
       return head;
    }
};