package patterns.adapter.example1.Model;

import patterns.adapter.example1.Interfaces.SocketAdapter;

public class SocketObjectAdapterImplementation implements SocketAdapter {

    private Socket socket = new Socket();

    public Volt get120Volts() {
        return socket.getVolt();
    }

    public Volt get12Volts() {
        Volt v = socket.getVolt();
        return convertVolt(v, 10);
    }

    public Volt get3Volts() {
        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    public Volt get1Volts() {
        return null;
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
