package designpattern.creational.builder.car.test;

public class Main {

	public static void main(String[] args) {
		// Directly
		Car car = new Car.Builder("Hatchback", "Red").engine("1.5L").hasSunroof(false).build();
		System.out.println(car);

		// Director
		CarDirector carDirector = new CarDirector();
		Car car1 = carDirector.constructBasicCar();
		System.out.println(car1);
		Car car2 = carDirector.constructLuxuryCar();
		System.out.println(car2);

//		== Output:
//		Car [model=Hatchback, color=Red, engine=1.5L, hasSunroof=false]
//		Car [model=Sedan, color=Blue, engine=2.0L, hasSunroof=false]
//		Car [model=SUV, color=Black, engine=3.5L, hasSunroof=true]
	}
}
