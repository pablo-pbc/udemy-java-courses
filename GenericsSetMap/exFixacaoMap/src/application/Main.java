/*
Na contagem de votos de uma eleição, são gerados vários registros
de votação contendo o nome do candidato e a quantidade de votos
(formato .csv) que ele obteve em uma urna de votação. Você deve
fazer um programa para ler os registros de votação a partir de um
arquivo, e daí gerar um relatório consolidado com os totais de cada
candidato.
*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> candidatesMap = new TreeMap<>();

        System.out.print("Enter file full path: ");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String csvLine = br.readLine();

            while (csvLine != null) {
                String[] candidateInfo = csvLine.split(",");

                String candidate = candidateInfo[0];
                Integer votes = parseInt(candidateInfo[1]);

                if (candidatesMap.containsKey(candidate)) {
                    candidatesMap.compute(candidate, (k, votesSum) -> votes + votesSum);
                } else {
                    candidatesMap.put(candidate, votes);
                }

                csvLine = br.readLine();
            }

            for (String key : candidatesMap.keySet()) {
                System.out.println(key + ": " + candidatesMap.get(key));
            }

        } catch (IOException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}