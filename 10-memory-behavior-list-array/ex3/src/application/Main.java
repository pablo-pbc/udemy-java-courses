package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
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

            System.out.print("Height: ");
            double height = sc.nextDouble();

            people[i] = new Person(name, age, height);
            sc.nextLine();
        }

        double sum = 0;
        for (Person person : people) {
            sum += person.getHeight();
        }
        System.out.print("Median height: " + Math.round(sum / people.length) + "\n");

        double lessThan16 = 0;
        String[] names = new String[people.length];
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < 16) {
                names[i] = people[i].getName();
                lessThan16++;
            }
        }
        System.out.print("Percent of persons with less than 16 years old: " + Math.round(lessThan16 / people.length * 100) + "%\n");
        for (String name : names) {
            if (name != null) {
                System.out.println(name);
            }
        }

        sc.close();
    }
}