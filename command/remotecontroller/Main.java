package command.remotecontroller;

public class Main {
    public static void main(String[] args){
        //RemoteController
        RemoteController controller = new RemoteController();

        //object
        Light light = new Light();
        TV tv = new TV();

        //commands
        Command lightOnCom = new LightOnCommand(light);
        Command lightOffCom = new LightOffCommand(light);
        Command tvOnCom = new TVOnCommand(tv);
        Command tvOffCom = new TVOffCommand(tv);
        Command[] coms = {lightOnCom,tvOnCom};
        MarcoCommand marcoCommand = new MarcoCommand(coms);

        //set coms
//        int order = 0;
//        controller.setCommand(order++,lightOnCom,lightOffCom);
//        controller.setCommand(order++,tvOnCom,tvOffCom);
        controller.setCommand(0,marcoCommand,new NoCommand());


        //print the info of those buttons
        controller.printButtonInfo();

        //run
        controller.buttonOnWasPressed(0);



    }
}
