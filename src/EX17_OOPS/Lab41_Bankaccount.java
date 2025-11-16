package EX17_OOPS;

import java.util.Scanner;

/*
Exercise 5 – “Bank Account”
Create a BankAccount class with:

variables: accountNumber, holderName, balance

a constructor to initialize these values

methods:

deposit(double amount)

withdraw(double amount) (check if sufficient balance)

displayBalance()

In main, create an account object, perform deposits and withdrawals, and display the balance after each.

Goal: Combine constructors, methods, and conditional logic.
 */

public class Lab41_Bankaccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    Lab41_Bankaccount(String accountNumber, String holderName, float balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.holderName =holderName;

    }

    void deposit( double amountdeposit)
    {
        //Scanner sc = new Scanner(System.in);
        System.out.println("The amount deposited is " + amountdeposit);
        balance= balance+amountdeposit;
        //return sc.nextDouble();
    }
    void withdraw(double amountwithdraw)
    {
        if(amountwithdraw> balance)
        {
            System.out.println("Insufficient balance.Enter the correct amount to be withdrawn");
            return ;
        }
        else {
            System.out.println("The amount withdrawn is " + amountwithdraw);
            balance = balance-amountwithdraw;
        }
    }
 void displayBalance()
 {
     System.out.println("The balance amount is " + balance);

 }

    public static void main(String[] args) {
        Lab41_Bankaccount b1= new Lab41_Bankaccount("HDFC123", "Sruthi" , 15000);
        b1.deposit(1200);
        b1.displayBalance();
        b1.withdraw(1000);
        b1.displayBalance();
    }
}

