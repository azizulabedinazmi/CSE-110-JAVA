package Azmi06;

import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PracticeBC {
    public static void main(String str[]) {
        Scanner input = new Scanner(System.in);
        int id = 100;
        double balance;
        double annualInterestRate = 4.5;
        double overdraft;
        int accountNo = 0;
        ArrayList<Account> listAccount = new ArrayList<>();
        do {
            System.out.println("Press (1) For Creating a Checking Account.");
            System.out.println("Press (2) For Creating a Savings Account.");
            System.out.print("Enter The Option : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    accountNo++;
                    id++;
                    System.out.print("Enter The Balance : ");
                    balance = input.nextDouble();
                    System.out.print("Enter The Overdraft Limits : ");
                    overdraft = input.nextDouble();
                    CheckingAccount obj1 = new CheckingAccount(id, balance, annualInterestRate,
                            overdraft);
                    listAccount.add(obj1);
                    break;

                case 2:
                    accountNo++;
                    id++;
                    Random rand = new Random();
                    long smallest = 10000;
                    long biggest = 99999;
                    long cardNo = ThreadLocalRandom.current().nextLong(smallest, biggest + 1);
                    System.out.print("Enter The Balance : ");
                    balance = input.nextDouble();
                    SavingsAccount obj = new SavingsAccount(id, balance, annualInterestRate,
                            cardNo);
                    listAccount.add(obj);
                    break;
            }
            System.out.println();
        } while (accountNo < 4);
        for (int i = 0; i < listAccount.size(); i++) {
            System.out.println(listAccount.get(i));
        }

        for (int i = 0; i < listAccount.size(); i++) {
            listAccount.get(i).deposit(200);
            listAccount.get(i).withdraw(500);
        }

        System.out.println("\nAccounts Details After Perform Pne Deposit(200) And One 1" +
                "Withdraw(500)Operation For Each Aaccount\n");
        for (int i = 0; i < listAccount.size(); i++) {
            System.out.println(listAccount.get(i));
        }
        input.close();
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Calendar dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = Calendar.getInstance();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = Calendar.getInstance();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate();
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance = balance - amount;
            return true;
        } else {
            System.out.println("Empty balance !!!");
            return false;
        }
    }

    public boolean deposit(double amount) {
        if (balance >= 0) {
            balance = balance + amount;
            return true;
        } else {
            System.out.println("Inactive Account.");
            return false;
        }
    }

 @Override
 public String toString() {
 return "\n Account ID : " + this.getId() + "\n Date Created : " +
this.getDateCreated().getTime() + "\n Current balance : $" + this.getBalance() + "\n Annual Interest rate : " + this.getAnnualInterestRate() + "%" + "\n Monthly Interest Amount : $" +
this.getMonthlyInterestAmount();
 }
}

class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount() {
        super();
        overdraft = 0.0;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public String toString() {
        return "Checking Account ->" + super.toString() + "\n Overdraft Limit : $" +
                this.getOverdraft();
    }
}

class SavingsAccount extends Account {
    private long cardNo;
    private Calendar expiryDate;

    public SavingsAccount() {

    }

    public SavingsAccount(int id, double balance, double annualInterestRate, long cardNo) {
        super(id, balance, annualInterestRate);
        this.cardNo = cardNo;
        this.expiryDate = Calendar.getInstance();
        expiryDate.add(Calendar.YEAR, 5);
    }

    public long getCardNo() {
        return cardNo;
    }

    public Calendar getExpiryDate() {
        return expiryDate;
    }

    public double getCreditBalance() {
        return 3 * getBalance();
    }

 @Override
 public String toString() {
 return "Savings Account ->" + super.toString() + "\n Credit Card Number : " +
this.getCardNo() + "\n Card Expiry Date : " + this.getExpiryDate().getTime() + "\n Credit Balance : &" + this.getCreditBalance();
 }
}
