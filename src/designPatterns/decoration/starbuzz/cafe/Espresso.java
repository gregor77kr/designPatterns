package designPatterns.decoration.starbuzz.cafe;

public class Espresso extends Beverage {
	
	public Espresso() {
		// 상속받은 member 변수
		description = "에스프레소";
	}
	
	// 첨가물 없는 에스프레소의 가격 1.99
	@Override	
	public double cost() {
		return 1.99;
	}
	
	
}
