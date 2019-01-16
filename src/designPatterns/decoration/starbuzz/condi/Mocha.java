package designPatterns.decoration.starbuzz.condi;

import designPatterns.decoration.starbuzz.cafe.Beverage;

// Mocha -> CondimentDecorator -> Beverage
public class Mocha extends CondimentDecorator {

	// wrap하고자 하는 음료를 저장하기 위한 인스턴스 변수
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	// Condiment로 부터 상속
	@Override
	public String getDescription() {
		// ex) 다크 로스트, 모카
		return beverage.getDescription() + ", 모카";
	}

	// Beverage로부터 상속
	@Override
	public double cost() {
		return .2 + beverage.cost();
	}

}
