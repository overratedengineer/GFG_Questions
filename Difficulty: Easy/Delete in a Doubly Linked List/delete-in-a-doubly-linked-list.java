/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        if(head==null){
            return head;
        }
         if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        Node temp = head;
        int count=1;
        while(temp!=null && count<x-1 ){
            temp=temp.next;
            count++;
        }
        if(temp.next==null){
            return head;
        }
        if(temp.next.next==null){
            temp.next=null;
        } else {
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
        }   
        return head;
    }
}