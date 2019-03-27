package patterns.Factory;

import patterns.Factory.interfaces.HamburgerStore;
import patterns.Factory.model.CheeseBurger;
import patterns.Factory.model.Hamburger;
import patterns.Factory.model.JamHamburgerstore;
import patterns.Factory.model.MozHamburgerStore;

public class demo {
    public static void main(String[] args) {

        CheeseBurger cheeseBurger = new CheeseBurger();

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );


        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");




    }
}
