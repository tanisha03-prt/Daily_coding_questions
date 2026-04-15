package recursion;

public class palindrome {
    static boolean paind(int i,String s){
        if(i>= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return paind(i+1,s);
    }
    public static void main(String[] args) {
        System.out.print(paind(0,"madam"));
    }
}
