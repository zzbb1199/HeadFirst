package test;

import java.time.chrono.ThaiBuddhistEra;

public class Main {
    public static void main(String[] args){
        Stat stat = new Stat();
        for(int i = 0;i<100;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    stat.change();
                    stat.print();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    stat.change();
                    stat.print();
                }
            }).start();
        }
    }
}
