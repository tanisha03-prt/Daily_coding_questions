package exceptional_handling;

import java.util.*;

public class NestedTryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            int balance = sc.nextInt();

            System.out.print("Enter withdraw amount: ");
            int withdraw = sc.nextInt();

            try {
                if (withdraw > balance) {
                    throw new ArithmeticException("Insufficient balance");
                }

                int remaining = balance - withdraw;
                System.out.println("Remaining balance: " + remaining);
            } 
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } 
        finally {
            sc.close();
            System.out.println("Transaction complete");
        }
    }
}
