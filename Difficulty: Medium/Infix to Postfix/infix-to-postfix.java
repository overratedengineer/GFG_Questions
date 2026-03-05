import java.util.*;

class Solution {
    
    public static int prec(char ch){
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '^') return 3;
        return -1;
    }
    
    public static String infixToPostfix(String s) {
        
        Stack<Character> st = new Stack<>();
        String ans = "";
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                ans += ch;
            }
            
            else if(ch == '('){
                st.push(ch);
            }
            
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans += st.pop();
                }
                st.pop();
            }
            
            else{
                while(!st.isEmpty() && 
                      ((prec(ch) < prec(st.peek())) || 
                      (prec(ch) == prec(st.peek()) && ch != '^'))){
                    ans += st.pop();
                }
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            ans += st.pop();
        }
        
        return ans;
    }
}