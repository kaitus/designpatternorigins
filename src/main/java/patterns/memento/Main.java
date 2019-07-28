package patterns.memento;

public class Main {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("PENDIENTE");

        Momento momento = originator.createMomento();

        CareTaker careTaker = new CareTaker();
        careTaker.addMomento(momento);

        originator.setState("INICIADO");
        originator.setState("ENPROCESO");

        momento = originator.createMomento();
        careTaker.addMomento(momento);

        originator.setState("FINALIZADO");

        System.out.println("Originator current state: " + originator.getState());

        System.out.println("Originator to previus state....");
        momento = careTaker.getMomento(1);
        originator.setMomento(momento);

        System.out.println("Originatot current state " + originator.getState());

        System.out.println("Again restoring to previous state.... ");
        momento = careTaker.getMomento(0);
        originator.setMomento(momento);

        System.out.println("Originatot current state " + originator.getState());

    }
}
