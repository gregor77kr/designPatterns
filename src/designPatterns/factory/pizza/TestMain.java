package designPatterns.factory.pizza;

public class TestMain {
	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore(new SimplePizzaFactory());
		ps.orderPizza("cheese");
	}
}
