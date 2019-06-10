package patterns.iterator.example1;

import patterns.iterator.example1.Interfaces.GeekyStoreIterator;

import java.util.ArrayList;

public class GeekyStoreCatalog {
    private ArrayList<Product> catalog;

    public GeekyStoreCatalog() {
        catalog = new ArrayList<Product>();

        addItem("Superman Comic", "The best in town", 12.99);
        addItem("Batman Comic", "Okay, but still good", 11.99);
        addItem("Start Wars", "Can't live without it", 39.99);
        addItem("Jedi T-Shirt", "Gotta have it", 29.99);
    }

    private void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);
        catalog.add(product);
    }

//    public ArrayList<Product> getCatalog() {
//        return catalog;
//    }

    public GeekyStoreIterator createIterator() {
        return new GeekyStoreIterator(catalog);
    }
}
