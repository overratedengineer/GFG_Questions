import java.util.*;

class Solution {
    
    int prec(char ch){
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '^') return 3;
        return -1;
    }
    
    public String infixToPrefix(String s) {
        
        String rev = "";
        
        // Step 1: Reverse and swap brackets
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            
            if(ch == '(') rev += ')';
            else if(ch == ')') rev += '(';
            else rev += ch;
        }
        
        Stack<Character> st = new Stack<>();
        String post = "";
        
        // Step 2: Convert to postfix
        for(int i = 0; i < rev.length(); i++){
            char ch = rev.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                post += ch;
            }
            
            else if(ch == '('){
                st.push(ch);
            }
            
            else if(ch == ')'){
                while(st.peek() != '('){
                    post += st.pop();
                }
                st.pop();
            }
            
            else{
                while(!st.isEmpty() && 
                      (prec(ch) < prec(st.peek()) || 
                      (prec(ch) == prec(st.peek()) && ch == '^'))){
                    post += st.pop();
                }
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            post += st.pop();
        }
        
        // Step 3: Reverse postfix
        String pre = "";
        for(int i = post.length()-1; i >= 0; i--){
            pre += post.charAt(i);
        }
        
        return pre;
    }
}