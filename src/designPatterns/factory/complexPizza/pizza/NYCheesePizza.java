package designPatterns.factory.complexPizza.pizza;

public class NYCheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare NYCheesePizza");

	}

	@Override
	public void bake() {
		System.out.println("bake NYCheesePizza");

	}

	@Override
	public void cut() {
		System.out.println("cut NYCheesePizza");

	}

	@Override
	public void box() {
		System.out.println("box NYCheesePizza");

	}

}
