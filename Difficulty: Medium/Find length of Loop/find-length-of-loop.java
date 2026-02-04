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
         if (head == null) {
            return 0;
        }
        Node slow = head;
        Node fast = head;
        int d =1;
           while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) {
                Node entry = slow.next;
                while (entry != slow) {
                    d++;
                    entry = entry.next;
                }
                return d;
            }
        }
        return 0;
    }
}