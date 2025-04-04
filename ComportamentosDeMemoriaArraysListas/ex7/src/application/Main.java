package application;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos os elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will be in the array?");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Type a number: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        average = sum / numbers.length;
        System.out.printf("Average: %.3f\n",average);

        for (double number : numbers) {
            if (number < average) {
                System.out.printf("Below average: %.1f\n", number);
            }
        }


        sc.close();
    }
}