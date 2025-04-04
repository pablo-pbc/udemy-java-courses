package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Informe seu nome:");
        student.name = sc.nextLine();
        System.out.println("Informe sua primeira nota:");
        student.grade1 = sc.nextDouble();
        System.out.println("Informe sua segunda nota:");
        student.grade2 = sc.nextDouble();
        System.out.println("Informe sua terceira nota:");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}