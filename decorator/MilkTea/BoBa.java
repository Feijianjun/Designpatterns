package shejimoshi.decorator.MilkTea;

import shejimoshi.decorator.MilkTea.Beverage;

public class BoBa extends Beverage {
	public BoBa() {
		description = "波霸奶茶";
	}
 
	public double cost() {
		return 10;
	}
}

