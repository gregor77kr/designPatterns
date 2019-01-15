package designPatterns.observer.weather.weatherClass;

import designPatterns.observer.weather.weatherInterface.DisplayElement;
import designPatterns.observer.weather.weatherInterface.Observer;
import designPatterns.observer.weather.weatherInterface.Subject;

public class StatisticalDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public StatisticalDisplay(Subject weatherData) {
		this.weatherData = weatherData;
	}
	
	@Override
	public void display() {
		System.out.println("Statistical Conditions :" );
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {

	}

}
