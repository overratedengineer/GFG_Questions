import java.util.*;

class Solution {
    static String preToInfix(String pre_exp) {
        
        Stack<String> st = new Stack<>();
        
        for(int i = pre_exp.length() - 1; i >= 0; i--){
            char ch = pre_exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                st.push(ch + "");
            }
            else{
                String a = st.pop();
                String b = st.pop();
                
                String exp = "(" + a + ch + b + ")";
                st.push(exp);
            }
        }
        
        return st.peek();
    }
}