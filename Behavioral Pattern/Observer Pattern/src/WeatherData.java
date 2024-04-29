import java.util.ArrayList;

public class WeatherData implements Subject{

    double temperature;
    double visibility;
    double wind;
    ArrayList<Observer> observerList;
    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observerList){
            o.update(temperature, visibility, wind);
        }
    }

    public double getLatestTemperature(){
        return 37.5;
    }

    public double getLatestWind(){
        return 18;
    }

    public double getLatestVisibility(){
        return 23;
    }

    public void dataChanged(){
        temperature = getLatestTemperature();
        wind = getLatestWind();
        visibility = getLatestVisibility();
    }
}
