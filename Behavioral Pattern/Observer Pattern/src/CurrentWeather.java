public class CurrentWeather implements Observer{
    double temperature;
    double visibility;
    double wind;
    @Override
    public void update(double temperature, double wind, double visibility) {
        this.temperature = temperature;
        this.wind = wind;
        this.visibility = visibility;
    }

    public void display()
    {
        System.out.println("\nCurrent Weather Display:\n"
                + "Temperature: " + temperature +
                "\nWind:" + wind + "Km" +
                "\nvisibility: " + "Km" );
    }
}
