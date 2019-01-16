package designPatterns.decoration.starbuzz.cafe;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		description = "하우스 블렌드 커피";
	}
	
	// 하우스 블렌드 커피 가격
	@Override
	public double cost() {
		return .89;
	}
	
}
