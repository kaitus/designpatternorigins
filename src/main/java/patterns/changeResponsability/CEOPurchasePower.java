package patterns.changeResponsability;

public class CEOPurchasePower extends PurchasePower {
    protected double getAllowble() {
        return BASE * 100000;
    }

    protected String getRole() {
        return "CEO";
    }
}
