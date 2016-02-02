package com.designpatterns.chapter2;

import com.designpatterns.chapter2.util.Observer;

/**
 * Description:
 */
public class CurrentConditionDisplay implements Observer, Display {
    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.getEventBus().subscribe(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F defrees and " + humidity + "% humidity");
    }

    @Override
    public void notifyStateChanged() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
