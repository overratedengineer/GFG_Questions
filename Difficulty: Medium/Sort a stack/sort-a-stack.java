class Solution {
    public void insert(Stack<Integer> st,int temp){
        if(st.isEmpty()||st.peek()<=temp){
            st.push(temp);
            return;
        }
        int val =st.pop();
        insert(st,temp);
        st.push(val);
    }
    public void sortStack(Stack<Integer> st) {
          if(st.isEmpty()){
              return;
          }
         // step 1: remove top
        int val = st.pop();

        // step 2: sort remaining stack (MISSING STEP)
        sortStack(st);

        // step 3: insert at correct position
        insert(st, val);
    }
}