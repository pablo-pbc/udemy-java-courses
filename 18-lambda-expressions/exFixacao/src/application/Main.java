package application;/*
Fazer um programa para ler os dados (nome, e-mail e salário) de funcionários a partir de um arquivo em formato .csv.

Em seguida mostrar, em ordem alfabética, o e-mail dos funcionários cujo salário seja superior a um dado valor
fornecido pelo usuário.

Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.

Veja exemplo na próxima página.
*/

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> employeeList = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            Double salary = sc.nextDouble();

            System.out.println("Email of people whose salary is more than " +  String.format("%.2f", salary) +":\n");

            List<String> emails = employeeList.stream()
                    .filter(emp -> emp.getSalary() > salary)
                    .map(Employee::getEmail)
                    .toList();

            emails.forEach(System.out::println);

            double salarySum = employeeList.stream()
                    .filter(emp -> emp.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", salarySum));

        }  catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}