package designpattern.test.structural.decorator.coffeeshopapplication;

// ConcreteComponent
public class BasicCoffee implements Coffee {

	@Override
	public String getDescription() {
		return "Basic Coffee";
	}

	@Override
	public int getCost() {
		return 1;
	}

}
