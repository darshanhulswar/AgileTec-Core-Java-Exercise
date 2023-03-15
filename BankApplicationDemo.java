/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agiletecexercise;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BankApplicationDemo {

    /**
     * @param args the command line arguments
     */
    /*
     Bank application:
    *******Welcome to Bank**********
    1. Create Account
    2. Deposit
    3. Withdraw
    4. Display
    5. Update contact number
    6. Exit

    Input:
    Name:
    Contact:
    Balance: 1000

    Output:
    Account created successfully...
     */
    public static void main(String[] args) {
        String name = "NULL";
        String contacNo = "NULL";
        int balance = 0, choice;
        int depositAmt, withdrawAmt;
        boolean accountExist = false;

        Scanner input = new Scanner(System.in);

        System.out.println("******** Welcome to Bank *********");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Display");
        System.out.println("5. Update contact number");
        System.out.println("6. Exit");

        System.out.println("Input your choice: ");
        choice = input.nextInt();
        while (choice != 6) {
            switch (choice) {
                case 1:
                    accountExist = true;
                    System.out.println("Enter Name: ");
                    name = input.next();
                    System.out.println("Contact No: ");
                    contacNo = input.next();
                    System.out.println("Enter balance: ");
                    balance = input.nextInt();
                    break;

                case 2:
                    accountExist = isAccountExist(accountExist);
                    if (!accountExist) {
                        break;
                    }
                    System.out.println("Please enter deposit amount: ");
                    depositAmt = input.nextInt();
                    balance = balance + depositAmt;
                    System.out.println("deposit successfull! ");
                    break;

                case 3:
                    accountExist = isAccountExist(accountExist);
                    if (!accountExist) {
                        break;
                    }
                    System.out.println("Please enter the amount to withdraw: ");
                    withdrawAmt = input.nextInt();
                    balance = withdrawAmount(balance, withdrawAmt);
                    break;

                case 4:
                    accountExist = isAccountExist(accountExist);
                    if (!accountExist) {
                        break;
                    }
                    System.out.println("Name: " + name);
                    System.out.println("Contact Number : " + contacNo);
                    System.out.println("Balance : " + balance);
                    break;

                case 5:
                    accountExist = isAccountExist(accountExist);
                    if (!accountExist) {
                        break;
                    }
                    System.out.println("Enter the contact number to update: ");
                    String oldContact = contacNo;
                    contacNo = input.next();
                    System.out.println("Contact number has been updated from " + oldContact + " to " + contacNo);

                case 6:
                    break;

                default:
                    System.out.println("Oops! invalid choice, please choose from 1-6");
            }

            System.out.println("Do you want to continue? (choose the option from 1-5)");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display");
            System.out.println("5. Update contact number");
            choice = input.nextInt();
        }
    }

    static boolean isAccountExist(boolean accountState) {
        if (accountState) {
            return true;
        } else {
            System.out.println("Account is not created yet, please choose the option 1 to create an account.");
            return false;
        }
    }

    static int withdrawAmount(int balance, int withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Insufficient amount to withdraw, available balance is: " + balance);
            return balance;
        }
        balance = balance - withdrawAmount;
        return balance;
    }

}
