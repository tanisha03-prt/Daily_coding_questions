import java.util.Scanner;

// Base Class
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }
}

// Savings Account
class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;   // 4%
    }
}

// Current Account
class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02;   // 2%
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        double balance = sc.nextDouble();

        Account account;   // Parent reference (Dynamic Method Dispatch)

        if (type.equalsIgnoreCase("SavingsAccount")) {
            account = new SavingsAccount(balance);
        } 
        else {
            account = new CurrentAccount(balance);
        }

        System.out.println("Interest Amount: " + account.calculateInterest());

        sc.close();
    }
}