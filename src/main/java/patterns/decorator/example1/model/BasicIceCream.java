package patterns.decorator.example1.model;

import patterns.decorator.example1.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating a basic iceCream!");
    }

    public double cost() {
        return 0.50;
    }
}
