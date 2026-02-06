/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        Node t = head;
        int nc = 0; 
        int c = 0;  
        while (t != null) {
            if (t.data == 9) nc++;
            else nc = 0;
            c++;
            t = t.next;
        }
        if (nc == c) {
            Node nh = new Node(1);
            nh.next = head;

            Node temp = head;
            while (temp != null) {
                temp.data = 0;
                temp = temp.next;
            }
            return nh;
        }

        Node temp = head;
        int steps = c - nc - 1;

        while (steps-- > 0) {
            temp = temp.next;
        }

        temp.data++;
        temp = temp.next;
        while (temp != null) {
            temp.data = 0;
            temp = temp.next;
        }

        return head;
         
    }
}