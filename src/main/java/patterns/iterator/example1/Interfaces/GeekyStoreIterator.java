package patterns.iterator.example1.Interfaces;

import patterns.iterator.example1.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class GeekyStoreIterator implements Iterator {

    ArrayList<Product> catalog;
    int position = 0;

    public GeekyStoreIterator(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }

    public boolean hasNext() {
        return position < catalog.size() && catalog.get(position) != null;
    }

    public Object next() {
        Product product = catalog.get(position);
        position = position + 1;
        return product;
    }

    public void remove() {

    }
}
