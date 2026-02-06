class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {

        Node temp = head;

        while (temp != null) {      
            Node nextNode = temp.next; 
            if (temp.data == x) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }

            temp = nextNode;            
        }

        return head;
    }
}
