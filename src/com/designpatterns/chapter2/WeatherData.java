package com.designpatterns.chapter2;

import com.designpatterns.chapter2.util.EventBus;
import com.designpatterns.chapter2.util.Observable;

/**
 * Description:
 */
public class WeatherData implements Observable {
    double humidity;
    double temperature;

    double pressure;

    private EventBus eventBus = new EventBus();

    public void setMeasurements(double humidity, double temperature, double pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        getEventBus().notifyStateChanged();
    }

    public double getHumidity() {
        return humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public EventBus getEventBus() {
        return this.eventBus;
    }
}
