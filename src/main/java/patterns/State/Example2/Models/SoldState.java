package patterns.State.Example2.Models;

public class SoldState implements State {
    SodaVendingMachine sodaVendingMachine;

    public SoldState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    public void insertMoney() {
        System.out.println("Give a second...");
    }

    public void ejectMoney() {
        System.out.println("Sorry...");
    }

    public void select() {
        System.out.println("Nope...");
    }

    public void dispense() {
        System.out.println("Stop trying ");
        if (sodaVendingMachine.getCount() > 0) {
            sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
        } else {
            System.out.println("Sorry... out of soda");
            sodaVendingMachine.setState(sodaVendingMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "Dispensing soda...";
    }
}
