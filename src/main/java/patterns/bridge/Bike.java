package patterns.bridge;

public class Bike extends Vehicle {

    public Bike(Workshop workshop, Workshop workshop2) {
        super(workshop, workshop2);
    }

    public void manufacture() {
        System.out.println("Bike...");
        workshop.make();
        workshop2.make();
    }
}
