/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        if(head==null || head.next==null) return head;
        Node temp = head;
        while(temp!=null){
            Node back= temp;
            temp=temp.next;
            while(temp!=null && back.data==temp.data){
                temp=temp.next;
            }
            if(temp==null){
                 back.next=null;
                 break;
            } else {
                Node front = temp;
            back.next= front;
            front.prev = back;
            }
        }
        return head;
    
    }
}