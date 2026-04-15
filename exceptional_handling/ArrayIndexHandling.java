package exceptional_handling;

import java.util.*;

public class ArrayIndexHandling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[7]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } 
        finally {
            System.out.println("Execution Completed");
        }
    }
}
