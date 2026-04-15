package exceptional_handling;
import java.util.*;
public class bank_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int withdraw = sc.nextInt();
            int balance = sc.nextInt();
            if(withdraw>balance){
                throw new Exception("insufficinet balance");
            }
            System.out.println("withdrawl successful");
        }
            catch(Exception e){
                System.out.println(e.getMessage());
            }finally{
                sc.close();
            }
        }
    }
    

