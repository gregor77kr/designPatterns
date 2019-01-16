package designPatterns.factory.complexPizza.pizza;

public class ChiPepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare ChiPepperoniPizza");

	}

	@Override
	public void bake() {
		System.out.println("bake ChiPepperoniPizza");

	}

	@Override
	public void cut() {
		System.out.println("cut ChiPepperoniPizza");

	}

	@Override
	public void box() {
		System.out.println("box ChiPepperoniPizza");

	}

}
