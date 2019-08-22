package shejimoshi.decorator.MilkTea;

import shejimoshi.decorator.MilkTea.Beverage;
import shejimoshi.decorator.MilkTea.CondimentDecorator;

public class HD extends CondimentDecorator {
	public HD(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 红豆";
	}

	public double cost() {
		return 2 + beverage.cost();
	}
}
