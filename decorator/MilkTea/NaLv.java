package shejimoshi.decorator.MilkTea;

import shejimoshi.decorator.MilkTea.Beverage;

public class NaLv extends Beverage {
  
	public NaLv() {
		description = "奶绿";
	}
  
	public double cost() {
		return 12;
	}
}

