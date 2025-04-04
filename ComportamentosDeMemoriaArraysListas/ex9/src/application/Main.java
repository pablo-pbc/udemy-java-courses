package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e as suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered?");
        int n = sc.nextInt();

        sc.nextLine();
        Person[] people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            System.out.printf("Enter person #%d data:\n", i + 1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            people[i] = new Person(name, age);
            sc.nextLine();
        }

        int maxAge = people[0].getAge();
        String maxName = people[0].getName();
        for (int i = 1; i < people.length; i++) {
            if (people[i].getAge() > maxAge) {
                maxAge = people[i].getAge();
                maxName = people[i].getName();
            }
        }

        System.out.print("Old person: " + maxName);

        sc.close();
    }
}