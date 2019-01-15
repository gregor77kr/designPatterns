package designPatterns.observer.weather.weatherClass;

import designPatterns.observer.weather.weatherInterface.DisplayElement;
import designPatterns.observer.weather.weatherInterface.Observer;
import designPatterns.observer.weather.weatherInterface.Subject;

public class StatisticalDisplay implements Observer, DisplayElement {
	private float maxTemp;
	private float minTemp;
	private float tempSum;
	private int count;
	private Subject weatherData;

	public StatisticalDisplay(Subject weatherData) {
		maxTemp = 0.0f;
		minTemp = 200;
		tempSum = 0.0f;
		count = 0;
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature : " + (tempSum / count) + "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		tempSum += temperature;
		count++;
	
		if (temperature > maxTemp) {
			maxTemp = temperature;
		}
		
		if (temperature < minTemp) {
			minTemp = temperature;
		}
		display();
	}

}
