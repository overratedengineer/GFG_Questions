class Solution {
    int s = -1;
    int p = -1;
    int ip(Node root, int key) {
        if (root == null) {
            return p;
        }
        if (key <= root.data) {
            return ip(root.left, key);
        } else {
            p = root.data;
            return ip(root.right, key);
        }
    }
    int is(Node root, int key) {
        if (root == null) {
            return s;
        }
        if (key >= root.data) {
            return is(root.right, key);
        } else {
            s = root.data;
            return is(root.left, key);
        }
    }

    public ArrayList<Node> findPreSuc(Node root, int key) {
        ip(root, key);
        is(root, key);
        ArrayList<Node> ans = new ArrayList<>();
        ans.add(p == -1 ? null : new Node(p));
        ans.add(s == -1 ? null : new Node(s));
        return ans;
    }
}