package shejimoshi.decorator.MilkTea;

import shejimoshi.decorator.MilkTea.Beverage;
import shejimoshi.decorator.MilkTea.CondimentDecorator;

public class YM extends CondimentDecorator {
	public YM(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 燕麦";
	}

	public double cost() {
		return 2 + beverage.cost();
	}
}
