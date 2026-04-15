package exceptional_handling;

import java.util.*;

public class ThrowsKeyword {

    // Method with throws
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = divide(a, b);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        finally {
            sc.close();
        }
    }
}
