package patterns.iterator.example1.Interfaces;

import patterns.iterator.example1.Product;

import java.util.Iterator;

public class DevStoreIterator implements Iterator {

    Product[] catalog;
    int position = 0;

    public DevStoreIterator(Product[] catalog) {
        this.catalog = catalog;
    }

    public boolean hasNext() {
        return position < catalog.length && catalog[position] != null;
    }

    public Object next() {
        Product product = catalog[position];
        position = position + 1;
        return product;
    }

    public void remove() {
        if (position <= 0) {
            throw  new IllegalStateException("cant remove item.");
        }
        if (catalog[position - 1] == null ) {
            for (int i = 0; i < (catalog.length -1); i++) {
                catalog[i] = catalog[i+1];
            }
            catalog[catalog.length - 1] = null;
        }
    }
}
