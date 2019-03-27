package patterns.decorator.example1.interfaces;

public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public double cost() {
        return this.iceCream.cost();
    }
}
