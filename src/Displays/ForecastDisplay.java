package Displays;

import Services.WeatherData;
import mainInterfaces.DisplayElement;
import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements DisplayElement, Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            lastPressure = currentPressure;
            currentPressure = ((WeatherData) o).getPressure();
            display();
        }
    }
    @Override
    public void display() {
        System.out.print("Forecast: ");
        if(lastPressure > currentPressure) System.out.println("Watch out for cooler, rainy weather");
        else if(lastPressure < currentPressure) System.out.println("Improving weather on the way!");
        else System.out.println("More of the same");
    }
}
