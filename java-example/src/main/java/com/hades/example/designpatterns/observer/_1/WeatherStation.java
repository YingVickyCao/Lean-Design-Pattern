package com.hades.example.designpatterns.observer._1;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementsChanged();
        weatherData.measurementsChanged();
    }
}