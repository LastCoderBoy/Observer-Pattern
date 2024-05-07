package Displays;

import Services.WeatherData;
import mainInterfaces.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {
    private float avgTemp = 0.0f;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private Observable observable;

    public StatisticsDisplay(Observable obs) {
        this.observable = obs;
        obs.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            float temp =((WeatherData) o).getTemperature();
            avgTemp += temp;
            if(temp<maxTemp){
                minTemp = temp;
            }
            if(temp>maxTemp) {
                maxTemp = temp;
            }

            display();
        }
    }
    @Override
    public void display() {
        System.out.println("Min/Avg/Max temp = " + minTemp + " " + avgTemp + " " + maxTemp);
    }
}
