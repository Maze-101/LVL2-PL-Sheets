package sheet3;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        
        account.setAnnualInterestRate(4.5);
        
        account.withdraw(2500);
        
        account.deposit(3000);

        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}