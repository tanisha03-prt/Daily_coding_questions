package bit_manipulation;

public class find_ith_bit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        if(((1<<i) & n) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    
}
