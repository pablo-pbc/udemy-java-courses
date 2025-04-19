package application;

import entities.Person;
import entities.Room;

import java.util.Locale;
import java.util.Scanner;

/*
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
*/

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented?");
        int roomsToBeRented = sc.nextInt();
        sc.nextLine();

        Room[] rooms = new Room[10];
        Person[] people = new Person[roomsToBeRented];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Rent #" + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int roomRented = sc.nextInt();

            sc.nextLine();

            people[i] = new Person(name, email);
            rooms[roomRented] = new Room(roomRented, true, name + ", " + email);
        }

        System.out.println("Rooms rented:");
        for (Room room : rooms) {
            if (room != null) {
                System.out.print(room);
            }
        }

        sc.close();
    }
}