package exceptional_handling;


public class handle_zero{
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try{ // iske ander risky code likhte hain
            int c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){ // error handle karte 
            System.out.println("Cannot Divide by zero");
        }finally{
            System.out.println("always run");
        }
    }
}