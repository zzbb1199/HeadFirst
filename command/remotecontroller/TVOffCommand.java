package command.remotecontroller;

public class TVOffCommand implements Command {

    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tvOff();
    }

    @Override
    public void undo() {
        tv.tvOn();
    }
}
