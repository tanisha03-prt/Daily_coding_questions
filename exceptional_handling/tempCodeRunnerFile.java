package exceptional_handling;
import java.util.*;
public class negative_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            if(a<0){
                throw new Exception("Negative not allowed");
            }
            System.out.println("number is positive");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
    
}
