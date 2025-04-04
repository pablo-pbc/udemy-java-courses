package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.print("Please, enter account number:");
        int number = sc.nextInt();
        System.out.print("Please, enter account holder:");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (Y/N)?");
        char option = sc.next().charAt(0);

        if (option == 'y') {
            System.out.print("Please, enter initial deposit value:");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(number, holder, initialDeposit);
        } else {
            account = new BankAccount(number, holder);
        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();

        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();

    }
}