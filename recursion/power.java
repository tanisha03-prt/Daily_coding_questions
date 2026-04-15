package recursion;

public class power {
    public static int pow(int base, int exp){
        if(exp==0) return 1;
        return base*pow(base,exp-1);
    }
    public static void main(String[] args) {
        System.out.print(pow(3,5));
    }
    
}
