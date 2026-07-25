/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        int x =0;
        Node temp=head;
        while(temp!=null){
            x++;
            temp=temp.next;
        }
        return x;
        
    }
}