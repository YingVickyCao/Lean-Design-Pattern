package com.hades.example.dp.observer_patttern._1;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementsChanged();
        weatherData.measurementsChanged();
    }
}