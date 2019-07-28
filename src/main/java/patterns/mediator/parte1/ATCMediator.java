package patterns.mediator.parte1;

public interface ATCMediator {

    void sendMessage(String msg, AirCraft airCraft);

    void addAirCraft(AirCraft airCraft);
}
