package patterns.State.Example2.Models;

public class SodaVendingMachine {

    State soldOutState;
    State noMoneyState;
    State hasMoneyState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public SodaVendingMachine(int numberOfSoda) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);

        this.count = numberOfSoda;

        if (numberOfSoda > 0) {
            state = noMoneyState;
        }
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void ejectMoney() {
        state.ejectMoney();
    }

    public void selectSoda() {
        state.select();
    }

    public void dispense() {
        state.dispense();
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nThe soda machine, go");
        result.append("\nInventory: " + count + " soda");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Soda vending machine is " + state + " \n");
        return result.toString();
    }
}
