package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people were entered?");
        int arrayLength, countMen = 0, countWomen = 0;
        double sumWomanHeight = 0, tallerHeight, shorterHeight;

        arrayLength = sc.nextInt();
        Person[] people = new Person[arrayLength];

        for (int i = 0; i < people.length; i++) {
            System.out.printf("Enter the Height of the #%d person:", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Enter the Gender of the #%d person:", i + 1);
            String gender = sc.next();

            people[i] = new Person(gender, height);
        }

        tallerHeight = people[0].getHeight();
        shorterHeight = people[0].getHeight();

        for (Person person : people) {
            if (person.getGender().equalsIgnoreCase("F")) {
                countWomen++;
                sumWomanHeight += person.getHeight();
            } else if (person.getGender().equalsIgnoreCase("M")) {
                countMen++;
            }

            if (person.getHeight() > tallerHeight) {
                tallerHeight = person.getHeight();
            } else if (person.getHeight() < shorterHeight) {
                shorterHeight = person.getHeight();
            }
        }

        System.out.print("Taller Height: " + tallerHeight + "\n");
        System.out.print("Shorter Height: " + shorterHeight + "\n");
        System.out.printf("Average Height of Women: %.2f\n", sumWomanHeight / countWomen);
        System.out.print("Men: " + countMen + "\n");


        sc.close();
    }
}