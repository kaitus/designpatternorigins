package patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List stateList = new ArrayList();

    public void addMomento(Momento me) {
        stateList.add(me);
    }

    public Momento getMomento(int index) {
        return (Momento) stateList.get(index);
    }
}
