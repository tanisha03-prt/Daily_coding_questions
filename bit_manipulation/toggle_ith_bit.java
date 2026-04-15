package bit_manipulation;

public class toggle_ith_bit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        n = (1<<i)^n;
        System.out.println(n);
    }
    
}
