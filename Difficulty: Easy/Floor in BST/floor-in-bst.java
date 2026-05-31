class Solution {
    public int findMaxFork(Node root, int k) {
        Node prev = null;

        while (root != null) {
            if (root.data == k) {
                return k;
            } 
              if(k>root.data){
                 prev =root;
                 root=root.right;
             } else {
                  root = root.left;
             }
          
        }

        if (prev == null) {
            return -1;
        }

        return prev.data;
    }
}