package designPatterns.decoration.starbuzz.condi;

import designPatterns.decoration.starbuzz.cafe.Beverage;

// 첨가물을 나타내는 객체
// Beverage 자리에 들어갈 수 있어야 하기에 상속
public abstract class CondimentDecorator extends Beverage {
	// 모든 첨가물 데코레이터에서 desc를 새로 구현
	public abstract String getDescription();
}
