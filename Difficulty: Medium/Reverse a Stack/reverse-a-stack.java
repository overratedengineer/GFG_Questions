class Solution {
    public static void helper(Stack<Integer> st,int temp){
         if(st.isEmpty()){
        st.push(temp);
        return;
         }
         int val=st.pop();
         helper(st,temp);
         st.push(val);
        
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int val = st.pop();
        reverseStack(st);
        helper(st,val);
        
    }
}
