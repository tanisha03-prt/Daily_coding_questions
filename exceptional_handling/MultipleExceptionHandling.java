package exceptional_handling;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int arr[] = {1, 2, 3};

        try {
            System.out.println(a / b);   // ❌ ArithmeticException
            System.out.println(arr[5]);  // ❌ (yeh execute hi nahi hoga)
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Error");
        }
        finally {
            System.out.println("Execution completed");
        }
    }
}