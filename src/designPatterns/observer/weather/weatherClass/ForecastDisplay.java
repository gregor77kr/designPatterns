package designPatterns.observer.weather.weatherClass;

import designPatterns.observer.weather.weatherInterface.DisplayElement;
import designPatterns.observer.weather.weatherInterface.Observer;
import designPatterns.observer.weather.weatherInterface.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure;
	private float previousPressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		currentPressure = 0.0f;
		previousPressure = 0.0f;
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.print("Forecast :");

		if (currentPressure > previousPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == previousPressure) {
			System.out.println("More of the same");
		} else {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		previousPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

}
