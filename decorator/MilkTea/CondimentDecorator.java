package shejimoshi.decorator.MilkTea;

import shejimoshi.decorator.MilkTea.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
