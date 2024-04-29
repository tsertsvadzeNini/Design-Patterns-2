public class AvarageWeatherDisplay implements Observer{
    private double windRate;
    private double predictedTemperature;
    @Override
    public void update(double temperature, double wind, double visibility) {
        this.windRate = wind/visibility;
        this.predictedTemperature = temperature * 1.2;
    }
    public void display()
    {
        System.out.println("\nAverage Weather Display: \n"
                + "Wind Rate: " + windRate + "Km" +
                "\nPredicted Weather: " + predictedTemperature);
    }
}
