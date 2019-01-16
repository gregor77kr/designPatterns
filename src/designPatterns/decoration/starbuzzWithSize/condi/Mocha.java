package designPatterns.decoration.starbuzzWithSize.condi;

import designPatterns.decoration.starbuzzWithSize.cafe.Beverage;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage b) {
		this.b = b;
	}

	@Override
	public String getDescription() {
		return b.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		if (b.getSize() == Size.TALL) {
			return b.cost() + .1;
		} else if (b.getSize() == Size.GRANDE) {
			return b.cost() + .15;
		} else {
			return b.cost() + .2;
		}
	}

}
