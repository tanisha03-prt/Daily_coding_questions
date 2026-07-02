package FA_1;

public class reverse_string_recursion {
    static String reverseString(String s){
        if(s.length() == 0) return "";
        return s.charAt(s.length() - 1) + reverseString(s.substring(0,s.length() - 1));
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
    
}

// o ko le liya + hell ko reverse kar diya 