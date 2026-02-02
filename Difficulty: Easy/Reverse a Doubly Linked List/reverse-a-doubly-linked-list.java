class Solution {
    public Node reverse(Node head) {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            // swap prev and next
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // move to next node (which is prev now)
            curr = curr.prev;
        }

        // temp will be at the previous node of new head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}
