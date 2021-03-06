package patterns.adapter.example1;

import patterns.adapter.example1.Interfaces.SocketAdapter;
import patterns.adapter.example1.Model.SocketAdapterImplementation;
import patterns.adapter.example1.Model.SocketObjectAdapterImplementation;
import patterns.adapter.example1.Model.Volt;

public class Demo {

    public static void main(String[] args) {
        System.out.println("***********Adapter design pattern******");
        testingObjectAdapter();
        System.out.println("***********Adapter design pattern******");
        testingClassAdapter();
    }

    private static void testingClassAdapter() {
        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(" V3 Volts is using Class Adapter " + v3.getVolts());
        System.out.println(" V12 Volts is using Class Adapter " + v12.getVolts());
        System.out.println(" V120 Volts is using Class Adapter " + v120.getVolts());
    }

    private static void testingObjectAdapter() {
        SocketObjectAdapterImplementation socketAdapter = new SocketObjectAdapterImplementation();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(" V3 Volts is using Object Adapter " + v3.getVolts());
        System.out.println(" V12 Volts is using Object Adapter " + v12.getVolts());
        System.out.println(" V120 Volts is using Object Adapter " + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3: return socketAdapter.get3Volts();
            case 12: return socketAdapter.get12Volts();
            case 120: return socketAdapter.get120Volts();
            default: return socketAdapter.get120Volts();
        }
    }
}
