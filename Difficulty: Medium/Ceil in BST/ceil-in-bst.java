/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        int v =-1;
       while(root!=null){
           if(root.data==x){
               return x;
           } 
           if(root.data>x){
               v=root.data;
               root=root.left;
           } else {
           root=root.right;
       }
       }
       return v;
        
    }
}