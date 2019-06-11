package patterns.iterator.example1;

import patterns.iterator.example1.Interfaces.Catalog;
import patterns.iterator.example1.Interfaces.Seller;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iterator design pattern");

        Catalog devStoreCatalog = new DevStoreCatalog();
        Catalog geekyStoreCatalog = new GeekyStoreCatalog();

        Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
        seller.printCatalog();

//        for (Product product : devCatalog) {
//            System.out.print(product.getName() + " ");
//            System.out.print(product.getDescription() + " ");
//            System.out.println(product.getPrice() + " ");
//        }
//
//        System.out.println("-----------------------");
//
//        for (Product aGeekyCatalog : geekyCatalog) {
//            Product product = (Product) aGeekyCatalog;
//            System.out.print(product.getName() + " ");
//            System.out.print(product.getDescription() + " ");
//            System.out.println(product.getPrice() + " ");
//        }

    }
}
