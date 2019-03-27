package patterns.Factory.model;

public class JamaicanCheeseBurger extends Hamburger {

    public JamaicanCheeseBurger() {
        name = "Jamaican style cheese burger";
        sauce = "Spicy jamaican sauce";
        buns = "Cookie dough buns!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking jamaican style...");
    }
}
