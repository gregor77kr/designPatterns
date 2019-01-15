package designPatterns.observer.weather.weatherClass;

import designPatterns.observer.weather.weatherInterface.DisplayElement;
import designPatterns.observer.weather.weatherInterface.Observer;
import designPatterns.observer.weather.weatherInterface.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	// 생성자에 weatherData 주제 객체가 전달되고, register됨
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	// print
	@Override
	public void display() {
		System.out.println("Current Conditions : " + temperature + " F degress and " + humidity + "% humidity");
	}
	
	// update and show
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	
}
