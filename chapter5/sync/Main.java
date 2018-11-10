package singleton.sync;

public class Main {
    public static void main(String[] args){
        Stat stat = new Stat();
        Thread aThread = new StatChangeThread(stat,"A");
        Thread bThread = new StatChangeThread(stat,"B");

        aThread.start();
        bThread.start();


    }
}
