package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter dc = new CurrencyConverter();

        System.out.println("What is the dollar price?");
        dc.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        dc.dollarBought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais =  %.2f%n", dc.amountPaidReal());

    }
}