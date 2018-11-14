package singleton.test;

public class Stat {
    private int a = 0;
    private int b = 0;

    public void change(){
        a ^= 1;
        b ^= 1;
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Stat{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
