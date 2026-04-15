package exceptional_handling;

import java.util.*;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b;  // ArithmeticException possible

            int[] arr = {10, 20, 30};
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Array element: " + arr[index]); // ArrayIndexOutOfBoundsException possible
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } 
        finally {
            sc.close();
            System.out.println("Program finished");
        }
    }
}