package state;

public class GumballMachine {
    private final NoQuarterState noQuarterState;
    private final HasQuarterState hasQuarterState;
    private final SoldOutState soldOutState;
    private final SoldState soldState;
    private final WinnerState winnerState;


    private State state;
    private int count = 0;

    @Override
    public String toString() {
        return "count:" + count + "," + "State" + state;
    }

    public WinnerState getWinnerState() {
        return winnerState;
    }

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
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


    public int getCount() {
        return count;
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
