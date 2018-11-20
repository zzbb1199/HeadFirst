package proxy.remoteproxy.gumballmachine;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    void tumCrank();

    void dispense();
}
