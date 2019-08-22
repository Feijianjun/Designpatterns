package shejimoshi.decorator.MilkTea;

import shejimoshi.decorator.MilkTea.Beverage;
import shejimoshi.decorator.MilkTea.CondimentDecorator;

public class NS extends CondimentDecorator {
	public NS(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", 奶霜";
	}
 
	public double cost() {
		return 2 + beverage.cost();
	}
}
