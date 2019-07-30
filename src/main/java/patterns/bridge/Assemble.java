package patterns.bridge;

public class Assemble implements Workshop {
    public void make() {
        System.out.println("..Also");
        System.out.println("Assembled");
    }
}
