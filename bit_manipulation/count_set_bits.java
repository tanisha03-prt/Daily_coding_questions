package bit_manipulation;

public class count_set_bits {
    public static void main(String[] args) {
        int n =13;
        //int i = 2;
        int count = 0;
        while(n>0){
            n = (n-1) & n;
            count++;
        }
        System.out.println(count);
    }
    
}
