package proxy.remoteproxy.rmi_test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server say, Hey";
    }

    public static void main(String[] args){
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
