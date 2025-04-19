package application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you gonna type?");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            sc.nextLine();
            System.out.print("Type a number:");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Pair numbers: ");
        int pairNumbers = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                pairNumbers++;
            }
        }

        System.out.println("\nThere are " + pairNumbers + " pair numbers.");

        sc.close();
    }
}