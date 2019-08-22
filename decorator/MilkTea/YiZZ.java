package shejimoshi.decorator.MilkTea;


public class YiZZ {

    public static void main(String args[]) {
        Beverage beverage = new MoCha();
        System.out.println(beverage.getDescription()
                + beverage.cost() + "元");

        Beverage beverage2 = new BoBa();
        beverage2 = new HD(beverage2);
        beverage2 = new NS(beverage2);
        beverage2 = new YM(beverage2);
        System.out.println(beverage2.getDescription()
                + beverage2.cost() + "元");

        Beverage beverage3 = new NaLv();
        beverage3 = new HD(beverage3);
        beverage3 = new HD(beverage3);
        beverage3 = new NS(beverage3);
        System.out.println(beverage3.getDescription()
                + beverage3.cost() + "元");
    }
}
