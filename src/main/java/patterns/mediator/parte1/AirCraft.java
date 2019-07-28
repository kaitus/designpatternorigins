package patterns.mediator.parte1;

public abstract class AirCraft {

    protected ATCMediator mediator;
    protected String name;

    public AirCraft(ATCMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void recive(String msg);
}
