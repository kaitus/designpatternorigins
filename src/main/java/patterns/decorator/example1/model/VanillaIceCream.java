package patterns.decorator.example1.model;

import patterns.decorator.example1.interfaces.IceCream;
import patterns.decorator.example1.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice-Cream!");
        return 1.2 + super.cost();
    }
}
