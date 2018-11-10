package singleton.sync;

public class Stat {
    public int a = 0;

    public int b = 0;

    public synchronized void change(){
        a ^= 1;
        b ^= 1;
        System.out.println(a+","+b);
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }
}
