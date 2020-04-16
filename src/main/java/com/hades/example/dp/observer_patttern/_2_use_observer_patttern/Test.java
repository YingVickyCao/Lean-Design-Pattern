package com.hades.example.dp.observer_patttern._2_use_observer_patttern;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementsChanged();
        weatherData.measurementsChanged();
    }
}