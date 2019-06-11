package patterns.State.Example2.Models;

public class NoMoneyState implements State {
    SodaVendingMachine sodaVendingMachine;

    public NoMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    public void insertMoney() {
        System.out.println("You insert a dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getHasMoneyState());
    }

    public void ejectMoney() {
        System.out.println("You havent inserted a dollar");

    }

    public void select() {
        System.out.println("You selected, but theres not money");

    }

    public void dispense() {
        System.out.println("Pay me first");
    }

    @Override
    public String toString() {
        return "Waiting for a dollar...";
    }
}
