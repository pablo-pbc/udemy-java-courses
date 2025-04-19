package application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
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

        System.out.print("Values: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.print("Sum: " + sum);

        System.out.println();
        int media = 0;
        media = sum / numbers.length;
        System.out.print("media: " + media);

        sc.close();
    }
}