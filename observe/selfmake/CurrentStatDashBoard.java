package observe.selfmake;

public class CurrentStatDashBoard extends BaseDashBoard implements Observer,DisPlayBehavior{
    @Override
    public void display() {
        System.out.println("CurrentStat:" + temperature + "," + humidity);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
