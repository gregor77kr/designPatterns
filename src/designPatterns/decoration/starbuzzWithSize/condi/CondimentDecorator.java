package designPatterns.decoration.starbuzzWithSize.condi;

import designPatterns.decoration.starbuzzWithSize.cafe.Beverage;

public abstract class CondimentDecorator extends Beverage {
	/*
	 * Beverage - size, cost, desc가 setting되어있음
	 * Condi - 첨가물 객체는 desc : 첨가물에 대한 설명, size별 cost
	 * cost 는 abstract라 그대로 상속받아 사용
	 * condi의 getDesc는 새롭게 재정의해야함(단순히 멤버변수 return하는 개념이 아님)
	 * getSize()는 super의 size를 get, 이 것이 없으면 자신의 size를 get하기에 항상 TALL로만 나옴
	 */
	Beverage b;

	// condi desc를 추가하고
	public abstract String getDescription();

	public Size getSize() {
		return b.getSize();
	}
}
