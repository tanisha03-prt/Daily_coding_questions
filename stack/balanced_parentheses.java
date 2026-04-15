package stack;

import java.util.*;

public class balanced_parentheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // opening bracket
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) return false;
                char top = st.pop();

               if(ch == ')' && top != '(') return false;
               if(ch == '}' && top != '{') return false;
               if(ch == ']' && top != '[') return false;
                
            }
        }

        return st.isEmpty();
        
    }

    public static void main(String[] args) {

        String s = "({[]})";

        boolean result = isValid(s);

        System.out.println(result);
    }
}