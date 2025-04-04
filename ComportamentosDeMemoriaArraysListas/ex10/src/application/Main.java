package application;

import entities.Person;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1.º e 2.º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovado aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be entered?");
        int n = sc.nextInt();

        sc.nextLine();
        Person[] people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Type your name, the first grade and the second grade: ");
            String name = sc.nextLine();
            double firstGrade = sc.nextDouble();
            double secondGrade = sc.nextDouble();

            sc.nextLine();
            people[i] = new Person(name, firstGrade, secondGrade, (firstGrade + secondGrade) / 2);
        }

        System.out.println("Approved students:");
        for (Person person : people) {
            if (person.getAverage() >= 6.0) {
                System.out.println(person.getName() + " is approved.");
            }
        }

        sc.close();
    }
}