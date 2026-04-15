package exceptional_handling;

public class nullPointerException {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String s = null;
        try{
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("null ponter");
        }finally{
            System.out.println("done");
        }
    }
    
}
