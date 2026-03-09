class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] nums2) {
        int n = nums2.length;
        ArrayList<Integer> al = new ArrayList<>();
         Stack<Integer> st = new Stack<>();
         for(int i=n-1;i>=0;i--){
          while(!st.isEmpty()&& nums2[i]<=st.peek()){
            st.pop();
          }
          al.add(st.isEmpty()?-1:st.peek());
          st.push(nums2[i]);
        }
        Collections.reverse(al);
        return al;
    }
}