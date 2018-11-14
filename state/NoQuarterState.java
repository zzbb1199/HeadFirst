package state;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("congradulations, you have insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you don't insert a quarter");
    }

    @Override
    public void tumCrank() {
        System.out.println("Sorry, you need insert a quarter first");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, you need insert a quarter first");
    }
}
