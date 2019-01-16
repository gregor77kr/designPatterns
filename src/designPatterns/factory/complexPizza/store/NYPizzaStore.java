package designPatterns.factory.complexPizza.store;

import designPatterns.factory.complexPizza.pizza.NYCheesePizza;
import designPatterns.factory.complexPizza.pizza.NYPepperoniPizza;
import designPatterns.factory.complexPizza.pizza.Pizza;

// pizza store in New York
public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese":
			pizza = new NYCheesePizza();
			break;
		case "pepperoni":
			pizza = new NYPepperoniPizza();
			break;
		}
		return pizza;
	}

}
