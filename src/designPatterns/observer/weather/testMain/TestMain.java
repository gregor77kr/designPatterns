package designPatterns.observer.weather.testMain;

import designPatterns.observer.weather.weatherClass.CurrentConditionsDisplay;
import designPatterns.observer.weather.weatherClass.ForecastDisplay;
import designPatterns.observer.weather.weatherClass.StatisticalDisplay;
import designPatterns.observer.weather.weatherClass.WeatherData;

public class TestMain {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionsDisplay(weatherData);
		new StatisticalDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
	}
}
