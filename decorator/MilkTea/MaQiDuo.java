package shejimoshi.decorator.MilkTea;

import shejimoshi.decorator.MilkTea.Beverage;

public class MaQiDuo extends Beverage {
	public MaQiDuo() {
		description = "玛奇朵";
	}
 
	public double cost() {
		return 14;
	}
}

