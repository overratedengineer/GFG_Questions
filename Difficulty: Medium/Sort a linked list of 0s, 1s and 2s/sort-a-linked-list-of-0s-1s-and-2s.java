/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        Node zero = new Node(-1);
        Node ones = new Node(-1);
        Node twos = new Node(-1);
        Node temp1=zero;
        Node temp2=ones;
        Node temp3=twos;
        Node temp = head;
        Node curr=temp;
        while(curr!=null)
        {
            temp=curr;
            if(temp.data==0) {
                temp1.next=temp;
                temp1=temp1.next;
            }
            if(temp.data==1) {
                temp2.next=temp;
                 temp2=temp2.next;
            }
            if(temp.data==2) {
                temp3.next=temp;
                 temp3=temp3.next;
            }
             curr=temp.next;
            temp.next=null;
        }
        temp1.next=(ones.next!=null)?ones.next:twos.next;
        if(ones.next!=null){
        temp2.next = twos.next;
        }
       if (zero.next != null) return zero.next;
       if (ones.next != null) return ones.next;
       return twos.next;
        
    }
}