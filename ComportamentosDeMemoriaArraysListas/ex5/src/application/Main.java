package application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you gonna type?");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            sc.nextLine();
            System.out.print("Type a number:");
            numbers[i] = sc.nextInt();
        }

        double greatest = numbers[0];
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
                position = i;
            }
        }
        System.out.println("Greatest number: " + greatest);
        System.out.println("Position:" + position);


        sc.close();
    }
}