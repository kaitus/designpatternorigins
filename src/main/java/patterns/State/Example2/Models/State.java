package patterns.State.Example2.Models;

public interface State {

    void insertMoney();

    void ejectMoney();

    void select();

    void dispense();
}
