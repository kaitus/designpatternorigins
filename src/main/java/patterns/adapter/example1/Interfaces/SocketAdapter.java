package patterns.adapter.example1.Interfaces;

import patterns.adapter.example1.Model.Volt;

public interface SocketAdapter {

    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();

    Volt get1Volts();

}
