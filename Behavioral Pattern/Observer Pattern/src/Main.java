public class Main {
    public static void main(String [] args){
        AvarageWeatherDisplay avarageWeater = new AvarageWeatherDisplay();
        CurrentWeather currentWeater = new CurrentWeather();

        WeatherData data = new WeatherData();

        data.registerObserver(avarageWeater);
        data.registerObserver(currentWeater);

        data.dataChanged();

        avarageWeater.display();
        currentWeater.display();

        data.unregisterObserver(avarageWeater);

        data.dataChanged();
    }
}
