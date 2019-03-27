package patterns.Factory.interfaces;

import patterns.Factory.model.*;

public class SimpleHamburgerFactory {
    public Hamburger createHamburger(String type) {
        Hamburger burger = null;
        if (type.equals("cheese")) {
            burger = new CheeseBurger();
        } else if (type.equals("greek")) {
            burger = new GreekBurger();
        } else if (type.equals("meatLover")) {
            burger = new MeatLover();
        } else if (type.equals("veggie")) {
            burger = new VeggieBurger();
        } else if (type.equals("bunLess")) {
            burger = new BunLessBurger();
        }
        return burger;
    }
}
