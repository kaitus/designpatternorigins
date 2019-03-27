package patterns.Factory.model;

import patterns.Factory.interfaces.HamburgerStore;

public class JamHamburgerstore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")) {
            return new JamaicanCheeseBurger();
        }else if (type.equals("veggie")) {
            return new JamaicanVeggieBurger();

        }else  return null;
    }
}
