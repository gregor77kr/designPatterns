package designPatterns.factory.complexPizza.pizza;

public class NYPepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare NYPepperoniPizza");
		
	}

	@Override
	public void bake() {
		System.out.println("bake NYPepperoniPizza");
		
	}

	@Override
	public void cut() {
		System.out.println("cut NYPepperoniPizza");
		
	}

	@Override
	public void box() {
		System.out.println("box NYPepperoniPizza");
		
	}

}
