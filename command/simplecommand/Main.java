package command.simplecommand;

public class Main {
    public static void main(String[] args){
        SimpleRemoteController remoteController = new SimpleRemoteController();
        Light light = new Light();
        LightCommand lightCommand = new LightCommand(light);
        remoteController.setCommand(lightCommand);  //remoteController 和 light 完全解耦
        remoteController.buttonWasPressed();
        GarageLight garageLight = new GarageLight();
        GarageLightCommand garageLightCommand = new GarageLightCommand(garageLight);
        remoteController.setCommand(garageLightCommand);
        remoteController.buttonWasPressed();
    }
}