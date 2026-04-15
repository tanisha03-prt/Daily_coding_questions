//package exceptional_handling;
import java.util.*;

public class age_less_than_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int age = sc.nextInt();

            if (age < 18) {
                throw new Exception("age less than 18");
            }

            System.out.println("eligible for vote");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
