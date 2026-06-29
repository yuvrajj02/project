package com.company;

import java.util.Scanner;

class BankAccount{
    String name;
    int accountnumber;
    double balance;

    void createAccount(String n ,int accNo , double bal){
        name = n;
        accountnumber= accNo;
        balance=bal;
    }

    void deposite(double amount){
        balance +=amount;
        System.out.println("Amount deposited "+ amount);
    }

    void withdraw(double amount){
        if (balance>amount){
            balance -=amount;
            System.out.println("Amount withdrawn "+amount);
        }
        else{
            System.out.println("Insufficient balance ");
        }
    }
    void display(){
        System.out.println("\n Account number : "+ accountnumber);
        System.out.println("Account holder name : "+name);
        System.out.println("Balance : "+ balance);
    }
}

public class bank_system {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount acc = new BankAccount();

        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter account number: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter initial balance: ");
                    double bal = sc.nextDouble();

                    acc.createAccount(name, accNo, bal);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposite(dep);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 4:
                    acc.display();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice!=5);

    }
}
