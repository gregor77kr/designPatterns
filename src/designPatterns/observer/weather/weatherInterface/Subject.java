package designPatterns.observer.weather.weatherInterface;

public interface Subject {
	// 옵저버 등록
	public void registerObserver(Observer o);
	// 옵저버 제거
	public void removeObserver(Observer o);
	// 옵저버에게 알리는 메서드
	public void notifyObserver();
}
