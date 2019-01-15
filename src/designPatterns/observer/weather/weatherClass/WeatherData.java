package designPatterns.observer.weather.weatherClass;

import java.util.ArrayList;

import designPatterns.observer.weather.weatherInterface.Observer;
import designPatterns.observer.weather.weatherInterface.Subject;

public class WeatherData implements Subject {
	public ArrayList<Observer> observerList;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observerList) {
			o.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	// 기상 data를 받아와서 set하고 observer에게 변화를 알리는 method
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
