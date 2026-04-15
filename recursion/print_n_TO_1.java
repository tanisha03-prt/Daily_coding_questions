package recursion;

public class print_n_TO_1 {
    public static void print(int n){
        if(n==0) return ;
        System.out.print(n+" ");
        print(n-1);
        
        
    }
    public static void main(String[] args) {
        print(5);
    }
    
}
