package designPatterns.factory.complexPizza.pizza;

public class ChiCheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare ChiCheesePizza");

	}

	@Override
	public void bake() {
		System.out.println("bake ChiCheesePizza");

	}

	@Override
	public void cut() {
		System.out.println("cut ChiCheesePizza");

	}

	@Override
	public void box() {
		System.out.println("box ChiCheesePizza");

	}

}
