package patterns.facade.example1.Model;

public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Added item to memoty..." + position);
    }
}
