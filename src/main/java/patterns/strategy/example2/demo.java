package patterns.strategy.example2;

import patterns.strategy.example2.controller.creditCardAlgorithm;
import patterns.strategy.example2.controller.payPalAlgorithm;
import patterns.strategy.example2.controller.shoppingCart;
import patterns.strategy.example2.model.product;

public class demo {

    public static void main(String[] args) {
        shoppingCart cart = new shoppingCart();
        product pant = new product("234", 25);
        product shirt = new product("987", 15);

        cart.addProduct(pant);
        cart.addProduct(shirt);

        cart.pay(new payPalAlgorithm("eduar@gmail.com", "nowayman"));

        cart.pay(new creditCardAlgorithm("carlos", "123456789"));
    }
}
