package state;

import java.util.Random;

public class HasQuarterState implements State {

    private GumballMachine gumballMachine;
    private Random random = new Random(System.currentTimeMillis());

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
        if (random.nextInt(10) == 0 && gumballMachine.getCount() >= 2) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("you should tum the crank");
    }
}