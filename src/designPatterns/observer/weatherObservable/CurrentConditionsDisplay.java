package designPatterns.observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	//subject
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable o) {
		o.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions :" + temperature + " F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		// subject가 WeatherData인 경우
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			// notifyObservers() -> update의 arg is null
			// 대신 subject의 get method를 통해서 직접 data를 가지고옴(pull 방식)
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
