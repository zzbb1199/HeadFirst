package command.simplecommand;

public class GarageLightCommand implements Command {

    private GarageLight light;

    public GarageLightCommand(GarageLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
