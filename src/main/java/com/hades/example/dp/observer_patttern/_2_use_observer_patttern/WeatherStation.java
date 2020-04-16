package com.hades.example.dp.observer_patttern._2_use_observer_patttern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure());

        weatherData.removeObserver(currentConditionDisplay);
        weatherData.removeObserver(forecastDisplay);
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure());

        weatherData.removeObserver(heatIndexDisplay);
        weatherData.measurementsChanged();
    }
}