package patterns.facade.example1.Model;

public class ComputerFacade {

    private CPU procesor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade(CPU procesor, Memory ram, HardDrive hd) {
        this.procesor = procesor;
        this.ram = ram;
        this.hd = hd;
    }

    public void start() {
        procesor.freeze();
        ram.load(132, hd.read(3456, 89));
        procesor.jump(132);
        procesor.execute();
    }
}
