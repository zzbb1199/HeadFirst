package state;

public class Main {
    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(10);

        //run
        for(int i = 0;i<10;i++){
            System.out.println(gumballMachine);
            gumballMachine.insertQuarter();
            gumballMachine.tumCrank();
            System.out.println(gumballMachine);
            System.out.println();
        }

    }
}
