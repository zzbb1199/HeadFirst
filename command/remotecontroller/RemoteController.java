package command.remotecontroller;

public class RemoteController {
    private Command[] onComs;
    private Command[] offComs;
    private Command undo;
    private final int SLOT_NUMS = 7;

    public RemoteController() {
        onComs = new Command[SLOT_NUMS];
        offComs = new Command[SLOT_NUMS];
        undo = new NoCommand();
        //init coms
        for(int i = 0;i<SLOT_NUMS;i++){
            onComs[i] = new NoCommand();
            offComs[i] = new NoCommand();
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand ){
        onComs[slot] = onCommand;
        offComs[slot] = offCommand;
    }

    public void buttonOnWasPressed(int slot){
        onComs[slot].execute();
        undo = onComs[slot];
    }

    public void buttonOffWasPressed(int slot){
        offComs[slot].execute();
        undo = offComs[slot];
    }

    public void unDo(){
        undo.undo();
    }

    public void printButtonInfo(){
        System.out.println("-------------RemoteController Info-------------");
        System.out.println("SLOT\tONCOMMAND\tOFFCOMMAND");
        for(int i = 0;i<SLOT_NUMS;i++){
            System.out.println(i
                    +"\t"+onComs[i].getClass().getSimpleName()
            +"\t"+offComs[i].getClass().getSimpleName());
        }
    }


}
