package patterns.mediator.parte1;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {

    private List<AirCraft> airCrafts;

    public void addAirCraft(AirCraft airCraft) {
        airCrafts.add(airCraft);
    }

    public ATCMediatorImpl() {
        this.airCrafts = new ArrayList<AirCraft>();
    }

    public void sendMessage(String msg, AirCraft airCraft) {
        for (AirCraft airCraft1Item :
                airCrafts) {
            if (airCraft1Item != airCraft) {
                airCraft1Item.recive(msg);
            }
        }
    }
}
