package designpattern.test.structural.decorator.coffeeshopapplication;

public class Main {

	public static void main(String[] args) {
		Coffee basicCoffee = new BasicCoffee();
		System.out.println(basicCoffee.getDescription() + ": " + basicCoffee.getCost());

		Coffee basicMilkCoffee = new MilkDecorator(basicCoffee);
		System.out.println(basicMilkCoffee.getDescription() + ": " + basicMilkCoffee.getCost());

		Coffee basicMilkSugarCoffee = new SugarDecorator(basicMilkCoffee);
		System.out.println(basicMilkSugarCoffee.getDescription() + ": " + basicMilkSugarCoffee.getCost());
	}
}
