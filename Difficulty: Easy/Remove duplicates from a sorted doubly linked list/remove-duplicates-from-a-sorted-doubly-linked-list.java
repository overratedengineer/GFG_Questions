/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        if(head==null||head.next==null){
            return head;
        }
       while((head!=null && head.next!=null) && head.data==head.next.data){
           head=head.next;
           head.prev=null;
       }
       Node temp=head;
        while(temp!=null){
            Node prevs = temp.prev;
            if(temp.next!=null){
                while((temp!=null && temp.next!=null) && temp.data==temp.next.data ){
                    temp=temp.next;
                }
                if (temp.prev != prevs) {
                prevs.next = temp;
                temp.prev = prevs;
            }
                
            }
            temp=temp.next;
        }
        return head;
    }
}