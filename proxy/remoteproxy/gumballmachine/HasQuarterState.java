package proxy.remoteproxy.gumballmachine;

import java.util.Random;

public class HasQuarterState implements State {

    private transient GumballMachine gumballMachine;
    private transient Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you have inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("ok, ejecting");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void tumCrank() {
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("you should tum the crank");
    }
}