package patterns.mediator.parte1;

public class AirCraftImpl extends AirCraft {

    public AirCraftImpl(ATCMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String msg) {
        System.out.println(this.name + " : sending message = " + msg);
        mediator.sendMessage(msg, this);
    }

    public void recive(String msg) {
        System.out.println(this.name + " : recive message = " + msg);

    }
}
