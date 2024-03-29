package designPatterns.observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure;
	private float lastPressurce;

	public ForecastDisplay(Observable o) {
		o.addObserver(this);
	}

	@Override
	public void display() {
		System.out.print("Forecast :");

		if (currentPressure > lastPressurce) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressurce) {
			System.out.println("More of the same");
		} else {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			lastPressurce = currentPressure;
			currentPressure = ((WeatherData) o).getPressure();
			display();
		}
	}

}
