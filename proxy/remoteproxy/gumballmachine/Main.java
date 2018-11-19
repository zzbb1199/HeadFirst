package proxy.remoteproxy.gumballmachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args){
        GumballMachineRemote gumballMachineRemote = null;

        int count;

        if(args.length < 1){
            System.out.println("gumball Machine <name>");
            System.exit(1);
        }
        try{
            count = Integer.parseInt(args[0]);

            gumballMachineRemote = new GumballMachine(count,"home");

            //register
            Naming.rebind("gumballmachine",gumballMachineRemote);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
