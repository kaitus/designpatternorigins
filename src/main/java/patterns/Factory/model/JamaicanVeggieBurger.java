package patterns.Factory.model;

public class JamaicanVeggieBurger extends Hamburger {

    public JamaicanVeggieBurger() {
        name = "Jamaican style vaggie burger";
        sauce = "Spicy jamaican sauce";
        buns = "Cookie wrap!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking jamaican style...");
    }
}
