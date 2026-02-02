/*
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
        if(head==null){
            return head;
        }
       Node temp = head;
       int count=0;
     Node node = new Node(x);
       while(temp!=null){
           if(count==p){
             node.next = temp.next;
                node.prev = temp;

                if (temp.next != null) {
                    temp.next.prev = node;
                }
                temp.next = node;
                break;
           }
           temp=temp.next;
           count++;
       }
       return head;
    }
}