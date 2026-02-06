/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
       Node tail = head;
       while(tail.next!=null){
           tail=tail.next;
       }
       Node l = head;
       Node r = tail;
       ArrayList<ArrayList<Integer>> al = new ArrayList<>();
       while(l.data<r.data){
          int needed = target - l.data;
          if(r.data>needed){
              r=r.prev;
          } else if(r.data<needed){
              l=l.next;
          } else{
              ArrayList<Integer> at = new ArrayList<>();
              at.add(l.data);
              at.add(r.data);
              al.add(at);
              l=l.next;
              r=r.prev;
          }
          
       }
       return al;
        
    }
}
