package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBankAccount {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n) ? ");
        char option = sc.next().charAt(0);

        if (option == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(name, number, initialDeposit);
        } else {
            bankAccount = new BankAccount(name, number);
        }

        System.out.println("Account data:");
        System.out.println(bankAccount);
        System.out.println();

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        sc.close();
    }
}
