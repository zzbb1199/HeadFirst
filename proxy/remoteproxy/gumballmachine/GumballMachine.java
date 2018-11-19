package proxy.remoteproxy.gumballmachine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private final NoQuarterState noQuarterState;
    private final HasQuarterState hasQuarterState;
    private final SoldOutState soldOutState;
    private final SoldState soldState;


    private State state;
    private int count = 0;
    private String location;

    @Override
    public String toString() {
        return "count:" + count + "," + "State" + state;
    }


    public GumballMachine(int count,String location) throws RemoteException{
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        this.location = location;
        if (count > 0) {
            this.count = count;
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return this.location;
    }

    @Override
    public State getState() throws RemoteException {
        return this.state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void tumCrank() {
        try {
            state.tumCrank();
            state.dispense();
        } catch (UnsupportedOperationException e) {

        }
    }

}
