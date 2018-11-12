package adapter.facade;

public class CdPlayer {
    public void on(){
        System.out.println(this.getClass().getSimpleName()+"on");
    }
    public void off(){
        System.out.println(this.getClass().getSimpleName()+"off");
    }
}
