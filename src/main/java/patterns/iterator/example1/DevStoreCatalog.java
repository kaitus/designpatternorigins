package patterns.iterator.example1;

import patterns.iterator.example1.Interfaces.Catalog;
import patterns.iterator.example1.Interfaces.DevStoreIterator;

public class DevStoreCatalog implements Catalog {

    private static final int MAX_ITEMS = 4;
    private int numberOfProducts = 0;
    Product[] catalog;

    public DevStoreCatalog() {
        catalog = new Product[MAX_ITEMS];

        addItem("C++ is NOT dead. Yet!", "T-Shirt", 39.99);
        addItem("JAVA Rocks. Yes!", "Silky mouse-pad", 19.99);
        addItem("Java design pattern", "Book", 139.99);
        addItem("Web developer", "The best web developer", 239.99);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);

        if (numberOfProducts >= MAX_ITEMS) {
            System.out.println("Catalogo is full - can't add products");
        } else {
            catalog[numberOfProducts] = product;
            numberOfProducts = numberOfProducts + 1;
        }
    }

//    public Product[] getCatalog() {
//        return catalog;
//    }

    public DevStoreIterator createIterator() {
        return new DevStoreIterator(catalog);
    }
}
