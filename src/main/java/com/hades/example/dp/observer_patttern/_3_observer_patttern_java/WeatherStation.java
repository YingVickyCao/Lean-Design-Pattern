package com.hades.example.dp.observer_patttern._3_observer_patttern_java;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(weatherData.mockTemperature(), weatherData.mockHumidity(), weatherData.mockPressure());

        weatherData.deleteObserver(currentConditionDisplay);
        weatherData.deleteObserver(forecastDisplay);
        weatherData.deleteObserver(statisticsDisplay);
        weatherData.setMeasurements(weatherData.mockTemperature(), weatherData.mockHumidity(), weatherData.mockPressure());

        weatherData.deleteObserver(heatIndexDisplay);
        weatherData.measurementsChanged();
    }
}