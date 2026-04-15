package bit_manipulation;

public class clear_ith_bit {
    public static void main(String[] args) {
        int n =13;
        int i = 1;
        n = ~(1<<i) & n;
        System.out.println(n);
    }
    
}
