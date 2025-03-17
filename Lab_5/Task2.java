/*
Task 2 - Bank Accounts:
Implement a simple banking system with different types of accounts like
Savings and Checking that inherit from a common Account class.
Encapsulate attributes in the base class: balance and accountNumber.
Implement polymorphism with the following methods:
deposit(double amount): Deposit the given amount into the account.
withdraw(double amount): Withdraw the given amount from the account.
displayAccountInfo(): Display the account number and current balance.
*/

package ovi.task2;
import java.util.*;

// Base class
abstract class Account {
    protected double balance;
    protected String accountNumber;
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

// Derived class - Savings Account
class SavingsAccount extends Account {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    public void applyInterest() {
        balance += balance * interestRate / 100;
    }
}

// Derived class - Checking Account
class CheckingAccount extends Account {
    private double overdraftLimit;
    
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 1000.0, 5.0);
        CheckingAccount ca = new CheckingAccount("CA456", 500.0, 200.0);
        
        sa.deposit(200);
        sa.withdraw(100);
        sa.applyInterest();
        sa.displayAccountInfo();
        
        ca.deposit(300);
        ca.withdraw(900);
        ca.displayAccountInfo();
    }
}
