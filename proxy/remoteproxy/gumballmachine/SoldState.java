package proxy.remoteproxy.gumballmachine;

public class SoldState implements State {

    private transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you have insert a quater");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you have tumed the crank, we can't eject quarter");
    }

    @Override
    public void tumCrank() {
        System.out.println("you have tumed");
    }

    @Override
    public void dispense() {
        System.out.println("yeath, candy lauch!");
        gumballMachine.setCount(gumballMachine.getCount() - 1);
        if(gumballMachine.getCount() ==  0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

}
