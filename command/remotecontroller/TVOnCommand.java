package command.remotecontroller;

public class TVOnCommand implements Command{

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tvOn();
    }

    @Override
    public void undo() {
        tv.tvOn();
    }
}
