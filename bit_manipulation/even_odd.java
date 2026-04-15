package bit_manipulation;


public class even_odd {
    public static void main(String[] args) {
        int n= 13;
        if(((1<<0) & n) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    
}
