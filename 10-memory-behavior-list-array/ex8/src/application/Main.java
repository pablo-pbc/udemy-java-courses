package application;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NÚMERO PAR"
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will be in the array?");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        int count = 0;
        double sum = 0;
        double media = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Type a number: ");
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                count++;
            }
        }

        if (sum == 0) {
            System.out.print("No pair numbers were entered.");
        } else {
            media = sum / count;
            System.out.printf("The average of the pair numbers entered is: %.1f%n", media);
        }


        sc.close();
    }
}