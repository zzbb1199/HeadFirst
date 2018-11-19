package proxy.remoteproxy.gumballmachine;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote machine){
        this.gumballMachineRemote = machine;
    }

    public void report(){
        try{
            System.out.println("Gumball Machine:"+gumballMachineRemote.getLocation());
            System.out.println("Current inventory:"+gumballMachineRemote.getCount());
            System.out.println("Current state:"+gumballMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
