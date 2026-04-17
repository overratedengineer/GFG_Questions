class Solution {
    ArrayList<Integer> al = new ArrayList<>();

    void side(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        al.add(root.data);
        if(root.left == null){
            side(root.right);
        } else {
            side(root.left);
        }
    }

    void leaf(Node root){
        if(root == null) return;

        if(root.left == null && root.right == null){
            al.add(root.data);
            return;
        }

        leaf(root.left);
        leaf(root.right);
    }

    void rs(Node root){
        if(root == null) return;

        if(root.left == null && root.right == null) return;

        if(root.right == null){
            rs(root.left);
        } else {
            rs(root.right);
        }

        al.add(root.data);
    }

    ArrayList<Integer> boundaryTraversal(Node root) {
        if(root == null) return al;

        al.add(root.data);

        side(root.left);
        leaf(root.left);
        leaf(root.right);
        rs(root.right);

        return al;
    }
}