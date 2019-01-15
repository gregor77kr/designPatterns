package designPatterns.observer.weather.weatherInterface;

public interface Observer {
	// 상태값 update 메서드
	public void update(float temperature, float humidity, float pressure);
}
