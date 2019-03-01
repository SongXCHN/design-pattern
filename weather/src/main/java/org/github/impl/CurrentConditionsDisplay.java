package org.github.impl;

import org.github.DisplayElement;
import org.github.Observer;
import org.github.Subject;

/**
 * 布告栏
 * Created by SongX on 2019/3/1.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }
}
