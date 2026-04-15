package exceptional_handling;

// ✅ Custom Exception Class
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class mera_khud_ka_exception {
    public static void main(String[] args) {

        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Invalid Age: Not eligible");
            }
            System.out.println("Age is valid");
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Execution completed");
        }
    }
}