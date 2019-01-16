package designPatterns.decoration.starbuzzWithSize.main;

import designPatterns.decoration.starbuzzWithSize.cafe.Beverage;
import designPatterns.decoration.starbuzzWithSize.cafe.Beverage.Size;
import designPatterns.decoration.starbuzzWithSize.cafe.DarkRoast;
import designPatterns.decoration.starbuzzWithSize.condi.Mocha;

public class TestMain {
	public static void main(String[] args) {
		Beverage b = new Mocha(new DarkRoast());
		System.out.println(b.getDescription() + " $" + b.cost());
		
		b = new Mocha(new Mocha(new DarkRoast()));
		System.out.println(b.getDescription() + " $" + b.cost());
		
		Beverage temp = new DarkRoast();
		temp.setSize(Size.VENTI);
		b = new Mocha(new Mocha(temp));
		System.out.println(b.getDescription() + " $" + b.cost() + b.getSize());
	}
}
