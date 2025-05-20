package designpattern.test.structural.decorator.coffeeshopapplication;

public abstract class CoffeeDecorator implements Coffee {

	protected Coffee decoratedCoffee;

	protected CoffeeDecorator(Coffee coffe) {
		this.decoratedCoffee = coffe;
	}
}
