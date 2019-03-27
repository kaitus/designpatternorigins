package patterns.decorator.example1.model;

import patterns.decorator.example1.interfaces.IceCream;
import patterns.decorator.example1.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-Cream!");
        return 1.5 + super.cost();
    }
}
