package proxy.remoteproxy.gumballmachine;

public class SoldOutState implements State {

    private transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("sorry, there are no candy");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you don't insert a quater");
    }

    @Override
    public void tumCrank() {
        System.out.println("you don't insert a quater");
        throw new UnsupportedOperationException();
    }

    @Override
    public void dispense() {
        System.out.println("you don't insert a quater");
    }
}
