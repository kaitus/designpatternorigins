package patterns.State.Example2.Models;

public class SoldOutState implements State {
    SodaVendingMachine sodaVendingMachine;

    public SoldOutState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    public void insertMoney() {
        System.out.println("Machine sold out");
    }

    public void ejectMoney() {
        System.out.println("Insert money first before ejecting");
    }

    public void select() {
        System.out.println("No soda available");
    }

    public void dispense() {
        System.out.println("Sold out!");
    }

    @Override
    public String toString() {
        return "Sold out!";
    }
}
