package observe.javaapi_buildinobesrve;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentStatDashBorad currentStatDashBorad = new CurrentStatDashBorad();
        weatherData.addObserver(currentStatDashBorad);
        weatherData.setWeatherData(100,200);
        weatherData.deleteObserver(currentStatDashBorad);
        weatherData.setWeatherData(2312,12);
    }
}
