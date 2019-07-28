package patterns.visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor() {
    }

    public double visitor(Shirt shirtItem) {
        System.out.println("Shirt final price with tax");
        double price = shirtItem.getPrice() * 1.30;
        return Double.parseDouble(Double.toString(price));
    }

    public double visitor(TShirt tshirtItem) {
        System.out.println("TShirt final price with tax");
        double price = tshirtItem.getPrice() * 1.20;
        return Double.parseDouble(Double.toString(price));
    }

    public double visitor(Jacket jacketItem) {
        System.out.println("Jacket final price with tax");
        double price = jacketItem.getPrice() * 1.10;
        return Double.parseDouble(Double.toString(price));
    }
}
