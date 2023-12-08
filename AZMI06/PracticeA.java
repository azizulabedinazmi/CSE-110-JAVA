package Azmi06;

public class PracticeA {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000, 4.5);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500.0);
        acc.deposit(3000.0);
        System.out.println("ID : " + acc.getId());
        System.out.println("BALANCE : $" + acc.getBalance());
        System.out.println("MONTHLY INTEREST : " + acc.getMonthlyInterest());
    }
}

class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this();
        this.id = id;
        this.balance = balance;
        Account.annualInterestRate = annualInterestRate;
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
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance = amount;
    }

    public void deposit(double amount) {
        this.balance = amount;
    }
}