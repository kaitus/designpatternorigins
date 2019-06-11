package patterns.State.Example2.Models;

public class HasMoneyState implements State {
    SodaVendingMachine sodaVendingMachine;

    public HasMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    public void insertMoney() {
        System.out.println("No need to insert another dollar bill");
    }

    public void ejectMoney() {
        System.out.println("Returning your dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
    }

    public void select() {
        System.out.println("Selected item...");
        sodaVendingMachine.setState(sodaVendingMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No soda dispense");
    }

    @Override
    public String toString() {
        return "Waiting to a new selection...";
    }
}
