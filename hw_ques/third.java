
class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    double processPayment() {
        return amount;
    }
}
class CreditCard extends Payment {
    CreditCard(double amount) {
        super(amount);
    }
    double processPayment() {   
        return amount + (amount * 0.02);   
    }
}
class DebitCard extends Payment {
    DebitCard(double amount) {
        super(amount);
    }
    double processPayment() {   
        return amount + (amount * 0.01);   
    }
}
class UPI extends Payment {
    UPI(double amount) {
        super(amount);
    }
    double processPayment() {   
        return amount + (amount * 0.005);  
    }
}

public class third {
    public static void main(String[] args) {
        String type = "CreditCard";
        double amount = 1000;
        Payment payment;  

        if (type.equalsIgnoreCase("CreditCard")) {
            payment = new CreditCard(amount);
        } 
        else if (type.equalsIgnoreCase("DebitCard")) {
            payment = new DebitCard(amount);
        } 
        else {
            payment = new UPI(amount);
        }
        System.out.println("Final Deducted Amount: " + payment.processPayment());
    }
}