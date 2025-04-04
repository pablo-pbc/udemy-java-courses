package application;

/*
Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final,
mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e
produtos usados possuem data de fabricação. Estes dados específicos devem ser
acrescentados na etiqueta de preço conforme exemplo (próxima página). Para produtos
importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
*/


import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char prodType = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (prodType == 'i'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();

                Product importedProduct = new ImportedProduct(name, price, customFee);
                productList.add(importedProduct);
            } else if (prodType == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Product usedProduct = new UsedProduct(name, price, date);
                productList.add(usedProduct);
            } else {
                Product product = new Product(name, price);
                productList.add(product);
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}