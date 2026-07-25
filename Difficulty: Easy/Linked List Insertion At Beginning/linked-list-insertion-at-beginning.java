/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
      if(head==null){
          head=new Node(x);
      } else {
         Node n = new Node(x);
         n.next=head;
         head=n;
      }
      return head;
    }
}