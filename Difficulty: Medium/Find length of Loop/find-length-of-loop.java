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
    public int lengthOfLoop(Node head) {
       Node slow = head; 
       Node fast = head;
       while(fast!=null && fast.next!=null){ 
           fast=fast.next.next;
           slow=slow.next;
           if(fast==slow){ 
               slow=slow.next;
               int cnt =1;
               while(slow!=fast){ 
                    cnt++; 
                   slow=slow.next;
                   } 
                   return cnt;
                   } 
       } 
       return 0;
        
    }
}