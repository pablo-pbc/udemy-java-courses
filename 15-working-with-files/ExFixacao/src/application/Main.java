package application;

/*
Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada ‘item’ possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma sub pasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele ‘item’ (preço unitário multiplicado pela quantidade),
conforme exemplo.
*/

import entities.Product;

import java.io.*;
import java.util.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        String path = "/home/pablo/MEGA/MEGAsync/Udemy/Java Completo/TrabalhandoComArquivos/produtos.csv";

        File sourceFile = new File(path);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "/out").mkdir();

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String csvLine = br.readLine();

            while (csvLine != null) {
                String[] productInfo = csvLine.split(",");

                String name = productInfo[0];
                Double price = parseDouble(productInfo[1]);
                Integer quantity = parseInt(productInfo[2]);

                Product product = new Product(name, price, quantity);
                products.add(product);

                csvLine = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for (Product product: products) {
                    bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}