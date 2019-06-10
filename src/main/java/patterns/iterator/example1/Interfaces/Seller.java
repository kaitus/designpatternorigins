package patterns.iterator.example1.Interfaces;

import patterns.iterator.example1.Product;

import java.util.Iterator;

public class Seller {

    Catalog geekyStoreCatalog;
    Catalog devStoreCatalog;

    public Seller(Catalog geekyStoreCatalog, Catalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }

    public void printCatalog() {
        Iterator geekyStoreIterator = geekyStoreCatalog.createIterator();
        System.out.println("Printing catalog: ");
        printCatalog(geekyStoreIterator);

        System.out.println("----------------");

        Iterator devStoreIterator = devStoreCatalog.createIterator();
        printCatalog(devStoreIterator);
    }

    public void printCatalog(Iterator geekyStoreIterator) {
        while (geekyStoreIterator.hasNext()) {
            Product product = (Product) geekyStoreIterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + ", ");
            System.out.println(product.getPrice());
        }
    }
}
