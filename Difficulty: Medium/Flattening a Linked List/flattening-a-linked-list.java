class Solution {
    Node merge(Node a, Node b) {

        Node dummy = new Node(0);
        Node temp = dummy;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.bottom = a;
                temp = a;
                a = a.bottom;
            } else {
                temp.bottom = b;
                temp = b;
                b = b.bottom;
            }
        }

        if (a != null) temp.bottom = a;
        else temp.bottom = b;
        return dummy.bottom;
    }

    public Node flatten(Node root) {
        if (root.next == null) {
            return root;
        }
        root.next = flatten(root.next);
        root = merge(root, root.next);
        return root;
    }
}