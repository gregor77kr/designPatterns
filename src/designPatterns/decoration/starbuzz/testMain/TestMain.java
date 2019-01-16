package designPatterns.decoration.starbuzz.testMain;

import designPatterns.decoration.starbuzz.cafe.Beverage;
import designPatterns.decoration.starbuzz.cafe.DarkRoast;
import designPatterns.decoration.starbuzz.cafe.Espresso;
import designPatterns.decoration.starbuzz.condi.Mocha;
import designPatterns.decoration.starbuzz.condi.Whip;

public class TestMain {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(new Mocha(new Whip(beverage2)));
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
	}
}
