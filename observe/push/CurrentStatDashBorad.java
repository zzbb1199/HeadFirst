package chapter2.push;

public class CurrentStatDashBorad implements Observer,DisplayBehavior{

    private float temperautre;

    private float humidty;


    private Observable observable;

    public CurrentStatDashBorad(Observable weatherSubject) {
        this.observable = weatherSubject;
        observable.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperautre = temperature;
        this.humidty = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CurrentStatDashBorad{" +
                "temperautre=" + temperautre +
                ", humidty=" + humidty +
                '}';
    }
}
