package command.remotecontroller;

public interface Command {
    void execute();

    void undo();
}
