import java.util.*;

class Solution {
    static String postToInfix(String exp) {
        
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                st.push(ch + "");
            }
            else{
                String b = st.pop();
                String a = st.pop();
                
                String ans = "(" + a + ch + b + ")";
                st.push(ans);
            }
        }
        
        return st.peek();
    }
}