package observe.pull;



public class CurrentStatDashBorad implements Observer,DisplayBehavior{

    private float temperautre;

    private float humidty;


    private Observable observable;

    public CurrentStatDashBorad(Observable weatherSubject) {
        this.observable = weatherSubject;
        observable.registerObserver(this);
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

    @Override
    public void update(Observable o) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperautre = weatherData.getTemperature();
            this.humidty = weatherData.getHumidity();
            display();
        }
    }
}
