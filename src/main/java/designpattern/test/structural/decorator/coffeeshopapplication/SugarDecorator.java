package designpattern.test.structural.decorator.coffeeshopapplication;

public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffe) {
		super(coffe);
	}

	@Override
	public String getDescription() {
		return this.decoratedCoffee.getDescription() + ", Sugar";
	}

	@Override
	public int getCost() {
		return this.decoratedCoffee.getCost() + 3;
	}
}
