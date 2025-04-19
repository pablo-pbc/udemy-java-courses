/*
Em um portal de cursos online, cada usuário possui um código único, representado por
um número inteiro.

Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.

O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.

Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
quantidade total e alunos dele, conforme exemplo.
*/

package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A?");
        int quantityA = sc.nextInt();

        for (int i = 0; i < quantityA; i++) {
            int studentHash = sc.nextInt();
            courseA.add(studentHash);
        }

        System.out.print("How many students for course B?");
        int quantityB = sc.nextInt();

        for (int i = 0; i < quantityB; i++) {
            int studentHash = sc.nextInt();
            courseB.add(studentHash);
        }

        System.out.print("How many students for course C?");
        int quantityC = sc.nextInt();

        for (int i = 0; i < quantityC; i++) {
            int studentHash = sc.nextInt();
            courseC.add(studentHash);
        }

        Set<Integer> totalStudents = new HashSet<>();
        totalStudents.addAll(courseA);
        totalStudents.addAll(courseB);
        totalStudents.addAll(courseC);

        System.out.print("Couse Total" + totalStudents);

        System.out.println("Total students: " + totalStudents.size());

        sc.close();
    }
}