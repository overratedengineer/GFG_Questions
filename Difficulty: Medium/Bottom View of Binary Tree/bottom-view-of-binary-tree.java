/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    
    class Pair {
        Node node;
        int line;
        
        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }
    
      public ArrayList<Integer> bottomView(Node root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) {
            return ans;
        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            
            Pair p = q.poll();
            
            Node node = p.node;
            int line = p.line;
            
           
                map.put(line, node.data);
            
            
            if(node.left != null) {
                q.offer(new Pair(node.left, line - 1));
            }
            
            if(node.right != null) {
                q.offer(new Pair(node.right, line + 1));
            }
        }
        
        for(int key : map.keySet()) {
            ans.add(map.get(key));
        }
        
        return ans;
    }
}