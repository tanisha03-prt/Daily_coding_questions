package stack;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        String str = "werfi";
        //StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
