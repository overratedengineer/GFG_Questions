/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
      Node temp=head;
    while (p > 0) {
            temp = temp.next;
            p--;
        }
      Node n = new Node(x);
   if (temp.next == null) {
            temp.next = n;
            n.prev = temp;
        } else {
            n.next = temp.next;
            n.prev = temp;          
            temp.next.prev = n;     
            temp.next = n;
        }
      return head;
        
    }
}