class Solution {

    public Node flatten(Node head) {
        if (head == null) return null;
\
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
        Node temp = head;
        while (temp != null) {
            pq.add(temp);
            temp = temp.next;
        }

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            tail.bottom = cur;
            tail = tail.bottom;

            if (cur.bottom != null) {
                pq.add(cur.bottom);
            }
        }

        tail.next = null;
        tail.bottom = null;

        return dummy.bottom;
    }
}