package bit_manipulation;

public class decimal_to_binary {
    public static String converttoBinary(int n){
        //if(n == 0) return "0";
        String res = " ";
        while(n!=1){
            if(n%2 == 0) res+= '0';
            else res+= '1';
            n=n/2;
        }
        String rev = " ";
        for(int i=res.length();i>=0;i--){
            rev += res.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(converttoBinary(n)); // 101
    }
}
