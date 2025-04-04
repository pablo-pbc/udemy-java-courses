package application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os num vetor. Em seguida, mostrar na tela todos os números negativos lidos.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you gonna type?");
        int n = sc.nextInt();
        int[] numbers = new int[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Type a number:");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Negative numbers:");
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}