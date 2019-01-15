package designPatterns.observer.weatherObservable;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;
	// observer 등록, 삭제는 super class Observable에 이미 구현되어있음

	// setChanged -> notifyObservers(object org) -> update() 호출 : push 방식
	// setChanged를 호출하여  flag = true로 만들어야만 notifyObservers가 작동
	public void measurementChanged() {
		setChanged();
		// observer에게 전달하는 data객체가 없으니까 pull 방식
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
