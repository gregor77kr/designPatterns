package designPatterns.factory.complexPizza.store;

import designPatterns.factory.complexPizza.pizza.Pizza;

public abstract class PizzaStore {
	
	// order : order steps equal in all sub-store objects
	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
	
	// create : created pizza type is different depend on sub-store object
	// create method of sub class is a factory
	protected abstract Pizza createPizza(String type);
}
