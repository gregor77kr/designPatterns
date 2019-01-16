package designPatterns.decoration.starbuzz.cafe;

public abstract class Beverage {
	// 음료의 최상위 객체
	String description = "제목 없음";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
