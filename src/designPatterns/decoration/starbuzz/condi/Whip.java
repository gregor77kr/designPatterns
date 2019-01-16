package designPatterns.decoration.starbuzz.condi;

import designPatterns.decoration.starbuzz.cafe.Beverage;

public class Whip extends CondimentDecorator {

	Beverage bevarage;

	public Whip(Beverage beverage) {
		this.bevarage = beverage;
	}

	@Override
	public String getDescription() {
		return bevarage.getDescription() + ", 휘핑";
	}

	@Override
	public double cost() {
		return .1 + bevarage.cost();
	}

}
