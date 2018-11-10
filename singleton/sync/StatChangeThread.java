package singleton.sync;

public class StatChangeThread extends Thread {

    private Stat stat;

    private String threadName;

    public StatChangeThread(Stat stat,String threadName) {
        this.stat = stat;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        super.run();
//        synchronized (stat.getClass()){
        statChangeTest();
//        }

    }

    private void statChangeTest(){
        stat.change();
    }
}
