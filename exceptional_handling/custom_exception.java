package exceptional_handling;
import java.util.*;

    class AgeException extends Exception{
        AgeException(String msg){
        super(msg);
    }
}
    public class custom_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            if(n<18){
                throw new AgeException("age is less than 18");
            }
            System.out.println("can vote");
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
}
    

