package ru.mirea.vinokurovazo.mireaproject;

public class WeatherResponse {
    public CurrentWeather current_weather;

    public static class CurrentWeather {
        public double temperature;
        public double windspeed;
    }
}