package designpattern.test.structural.decorator.coffeeshopapplication;

public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee coffe) {
		super(coffe);
	}

	@Override
	public String getDescription() {
		return this.decoratedCoffee.getDescription() + ", Milk";
	}

	@Override
	public int getCost() {
		return this.decoratedCoffee.getCost() + 2;
	}
}
