package patterns.mediator.parte1;

public class Main {

    public static void main(String[] args) {
        ATCMediator mediator = new ATCMediatorImpl();

        AirCraft boing1 = new AirCraftImpl(mediator, "Boing 1");
        AirCraft helicopter = new AirCraftImpl(mediator, "helicpter 1");
        AirCraft boing707 = new AirCraftImpl(mediator, "Boing 707");

        mediator.addAirCraft(boing1);
        mediator.addAirCraft(helicopter);
        mediator.addAirCraft(boing707);

        boing1.send("Hello from boing1");
    }
}
