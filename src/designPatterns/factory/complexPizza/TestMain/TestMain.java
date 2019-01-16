package designPatterns.factory.complexPizza.TestMain;

import designPatterns.factory.complexPizza.store.NYPizzaStore;
import designPatterns.factory.complexPizza.store.PizzaStore;

public class TestMain {
	public static void main(String[] args) {
		PizzaStore ny = new NYPizzaStore();
		ny.orderPizza("cheese");
	}
}
