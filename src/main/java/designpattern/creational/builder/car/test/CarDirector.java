package designpattern.creational.builder.car.test;

// Director
public class CarDirector {

	public Car constructBasicCar() {
		return new Car.Builder("Sedan", "Blue").engine("2.0L").hasSunroof(false).build();
	}

	public Car constructLuxuryCar() {
		return new Car.Builder("SUV", "Black").engine("3.5L").hasSunroof(true).build();
	}
}
