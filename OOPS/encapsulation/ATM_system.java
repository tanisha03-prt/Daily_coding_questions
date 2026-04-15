package encapsulation;


class BankAccount{
    private int balance;
    private int pin;

    BankAccount(int balance, int pin){
        this.balance = balance;
        this.pin = pin;
    }
    void deposit(int amount,int enteredPin){
        if(enteredPin != pin){
            System.out.println("invalid pin");
            return;
        }
        if(amount<=0){
            System.out.println("invalid amount");
            return;
        }
        balance += amount;
    }
    void withdraw(int amount, int enteredPin){
        if(enteredPin != pin){
            System.out.println("invalid pin");
            return;
        }
        if(amount>balance){
            System.out.println("insufficint balance");
            return;
        }
        balance -= amount;
    }
    void checkBalance(int enteredPin){
        System.out.println(balance);
    }

}
public class ATM_system {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1234, 1000);

        acc.deposit(500, 1234);
        acc.withdraw(300, 1234);
        acc.checkBalance(1234);

        acc.withdraw(2000, 1234); // insufficient
        acc.deposit(100, 9999);   // wrong pin
    }
}
