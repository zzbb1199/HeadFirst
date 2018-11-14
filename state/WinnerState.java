package state;

public class WinnerState implements State {


    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you have inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you have tumed the crank");
    }

    @Override
    public void tumCrank() {
        System.out.println("you have tum the crank");
    }

    @Override
    public void dispense() {
        System.out.println("yeath, crank lauch twice!");
        gumballMachine.setCount(gumballMachine.getCount() -2);
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
