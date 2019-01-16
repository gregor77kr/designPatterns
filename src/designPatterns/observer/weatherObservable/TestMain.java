package designPatterns.observer.weatherObservable;

import javax.swing.JButton;

public class TestMain {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 80, 75.2f);
		
	}
}
