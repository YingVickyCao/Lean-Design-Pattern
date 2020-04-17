package com.hades.example.designpatterns.observer._3_use_observer_patttern_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 气象统计
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Integer> temperatures = new ArrayList<>();
    private Observable mObservable;

    public StatisticsDisplay(Observable observable) {
        mObservable = observable;
        mObservable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;

            temperatures.add(weatherData.getTemperature());

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("气象统计：");
        System.out.println("最低温度：" + Collections.min(temperatures));
        System.out.println("最高温度：" + Collections.max(temperatures));
        System.out.println("平均温度：" + (int) temperatures.stream().mapToInt(Integer::intValue).average().getAsDouble());
        System.out.println();
    }
}
