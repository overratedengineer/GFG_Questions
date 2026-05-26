/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void find(Node root,ArrayList<ArrayList<Integer>> al,ArrayList<Integer> list){
        if(root.left==null && root.right==null){
           al.add(new ArrayList<>(list));
            return;
        }
        if(root.left!=null){
            list.add(root.left.data);
            find(root.left,al,list);
           list.remove(list.size()-1);
        }
        if(root.right!=null){
            list.add(root.right.data);
            find(root.right,al,list);
           list.remove(list.size() - 1);
        }
        
    }
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        if(root==null) return al;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
       find(root,al,list);
        return al;
    }
}