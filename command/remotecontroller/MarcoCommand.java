package command.remotecontroller;

public class MarcoCommand implements Command {

    private Command[] coms;

    public MarcoCommand(Command... coms) {
        this.coms = new Command[coms.length];
        for(int i = 0;i<coms.length;i++){
            this.coms[i] = coms[i];
        }
    }

    @Override
    public void execute() {
        for(int i = 0;i<coms.length;i++){
            coms[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0;i<coms.length;i++){
            coms[i].undo();
        }
    }
}
