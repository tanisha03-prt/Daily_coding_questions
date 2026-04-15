package exceptional_handling;

public class input_mismatch {
    Scanner sc = new Scanner(System.in);
    try{
        int n = sc.nextInt();
        System.out.println(num);
    } catch(InputMismatchException e){
        System.out.println("Inavalid Input");
    }finally{
        sc.close();
    }
}
