/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        if(head==null) return head;
         Node temp = head;
         while(temp!=null){
             if(temp.data==x){
                 if(temp == head){
                head = temp.next;
                 }
                 if(temp.next!=null){
                     temp.next.prev = temp.prev;
                 } 
                 if(temp.prev!=null){
                      temp.prev.next=temp.next;
                 } 

             }
              temp=temp.next;
         }
         return head;
    }
}