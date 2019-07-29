package patterns.changeResponsability;

public class DirectorPurchasePower extends PurchasePower {
    protected double getAllowble() {
        return BASE * 20;
    }

    protected String getRole() {
        return "Director";
    }
}
