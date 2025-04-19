package application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will be in the arrays?");
        int n = sc.nextInt();
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];

        System.out.println("Type the first vector values:");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = sc.nextInt();
        }

        System.out.println("Type the second vector values:");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = sc.nextInt();
        }

        int[] vectorC = new int[n];
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.printf("C[%d] = %d%n", i, vectorC[i]);
        }

        sc.close();
    }
}