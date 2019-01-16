package designPatterns.factory.complexPizza.store;

import designPatterns.factory.complexPizza.pizza.ChiCheesePizza;
import designPatterns.factory.complexPizza.pizza.ChiPepperoniPizza;
import designPatterns.factory.complexPizza.pizza.Pizza;

public class ChiPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		switch (type) {
		case "cheese":
			pizza = new ChiCheesePizza();
			break;

		case "pepperoni":
			pizza = new ChiPepperoniPizza();
			break;
		}
		return pizza;
	}

}
