package Observer;

public class Main {
    public  static void main (String[] args){
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setMeasurements(75,69,34.6f);
        weatherStation.setMeasurements(45,62,65.6f);
    }
}
