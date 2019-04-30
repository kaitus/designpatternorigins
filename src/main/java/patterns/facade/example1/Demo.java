package patterns.facade.example1;

import patterns.facade.example1.Model.CPU;
import patterns.facade.example1.Model.ComputerFacade;
import patterns.facade.example1.Model.HardDrive;
import patterns.facade.example1.Model.Memory;

public class Demo {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hd = new HardDrive();
        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hd);
        computerFacade.start();
        
    }
}
