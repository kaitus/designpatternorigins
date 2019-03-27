package patterns.decorator.example1;

import patterns.decorator.example1.interfaces.IceCream;
import patterns.decorator.example1.model.BasicIceCream;
import patterns.decorator.example1.model.ChocolateIceCream;
import patterns.decorator.example1.model.MintIceCream;
import patterns.decorator.example1.model.VanillaIceCream;

public class demo {
    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-Cream cost $" + basicIceCream.cost() + "\n");

        ChocolateIceCream chocolateIceCream = new ChocolateIceCream(basicIceCream);
        System.out.println("Chocolate Ice-Cream cost $" + chocolateIceCream.cost()+ "\n");

        MintIceCream mintIceCream = new MintIceCream(basicIceCream);
        System.out.println("Mint Ice-Cream cost $" + mintIceCream.cost()+ "\n");

        VanillaIceCream vanillaIceCream = new VanillaIceCream(basicIceCream);
        System.out.println("Vanilla Ice-Cream cost $" + vanillaIceCream.cost() + "\n");

        ChocolateIceCream chocolateIceCreamVanilla = new ChocolateIceCream(vanillaIceCream);
        System.out.println("Chocolate width Vanilla Ice-Cream cost $" + chocolateIceCreamVanilla.cost());

    }
}
