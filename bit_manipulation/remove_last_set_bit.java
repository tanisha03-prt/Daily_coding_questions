package bit_manipulation;


public class remove_last_set_bit {
    public static void main(String[] args) {
        int n = 12;
        n = n & (n-1);
        System.out.println(n);
    }
    
}
