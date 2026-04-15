package encapsulation;

// encapsulation;

class Bank {
    private int balance;

    void setBalance(int balance) {
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }
}

public class bank_account {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.setBalance(2434);   // ✔ correct way
        System.out.println(b.getBalance());
    }
}
