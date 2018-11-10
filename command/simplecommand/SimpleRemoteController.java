package command.simplecommand;

public class SimpleRemoteController {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
