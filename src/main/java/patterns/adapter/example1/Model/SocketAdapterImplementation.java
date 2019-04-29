package patterns.adapter.example1.Model;

import patterns.adapter.example1.Interfaces.SocketAdapter;

public class SocketAdapterImplementation extends Socket implements SocketAdapter {

    public Volt get120Volts() {
        return getVolt();
    }

    public Volt get12Volts() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    public Volt get3Volts() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    public Volt get1Volts() {
        return get1Volts();
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
