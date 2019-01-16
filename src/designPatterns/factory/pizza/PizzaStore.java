package designPatterns.factory.pizza;

public class PizzaStore {
	// 1. pizza store gets a order
	// 2. create pizza object using pizza factory
	// 3. then do stuff to make a pizza
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
