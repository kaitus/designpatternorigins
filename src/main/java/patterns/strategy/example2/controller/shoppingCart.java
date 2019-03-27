package patterns.strategy.example2.controller;

import patterns.strategy.example2.model.product;

import java.util.ArrayList;
import java.util.List;

public class shoppingCart {

    List<product> productList;

    public shoppingCart() {
        this.productList = new ArrayList<product>();
    }

    public void addProduct(product p) {
        productList.add(p);
    }

    public void removeProduct(product p) {
        productList.remove(p);
    }

    public int calculateTotal() {
        int sum = 0;
        for (product p :
                productList) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void pay(payment paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
