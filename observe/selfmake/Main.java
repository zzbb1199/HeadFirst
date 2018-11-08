package observe.selfmake;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentStatDashBoard currentStatDashBoard = new CurrentStatDashBoard();
        AverageStatDashBord averageStatDashBord = new AverageStatDashBord();

        weatherData.registerObserver(currentStatDashBoard);
        weatherData.registerObserver(averageStatDashBord);

        weatherData.setWeatherData(30,30);

        weatherData.removeObserver(averageStatDashBord);
        weatherData.setWeatherData(30,30);
    }
}
