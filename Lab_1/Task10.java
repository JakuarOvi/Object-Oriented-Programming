
package ovi.task10;
class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount() {
        this.accountNumber = "Unknown";
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }
}

public class Task10 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("12345678", 1000.00);

        account1.displayInfo();
        account2.displayInfo();
    }
}