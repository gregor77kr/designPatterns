package designPatterns.observer.weather.testMain;

import designPatterns.observer.weather.weatherClass.CurrentConditionsDisplay;
import designPatterns.observer.weather.weatherClass.WeatherData;

public class TestMain {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
