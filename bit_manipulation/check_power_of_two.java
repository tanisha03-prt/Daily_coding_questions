package bit_manipulation;

public class check_power_of_two {
    public static void main(String[] args) {
        int n = 16;
        if(n>0 && (n&(n-1)) == 0){
            System.out.println("power of 2");
        }else{
            System.out.println("not power");
        }
    }
    
}
