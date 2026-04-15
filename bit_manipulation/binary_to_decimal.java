package bit_manipulation;

public class binary_to_decimal {
    static int binaryToDecimal(String x){
        int num = 0;
        int power = 1;
        for(int i = x.length()-1;i>=0;i--){
            if(x.charAt(i) == '1'){
                num = num + power;
            }
            power = power*2;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("1001"));
    }
    
}
