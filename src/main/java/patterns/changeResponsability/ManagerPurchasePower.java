package patterns.changeResponsability;

public class ManagerPurchasePower extends PurchasePower {
    protected double getAllowble() {
        return BASE * 10;
    }

    protected String getRole() {
        return "Manager";
    }
}
