package designpattern.test.designpattern.behavioral.observer.weatherstationsystem;

public class Main {

	public static void main(String[] args) {
		// Subject
		WeatherStation station = new WeatherStation();
		
		// Observer
		WeatherObserver observer1 = new TemperatureDisplay("display1");
		WeatherObserver observer2 = new TemperatureDisplay("display2");
		WeatherObserver observer3 = new TemperatureLogger("logger1");
		
		// Register
		station.attach(observer1);
		station.attach(observer2);
		station.attach(observer3);
		
		// When change temperature
		station.setTemperature(40);
		
		// Remove
		System.out.println("-- After remove");
		station.detach(observer2);
		station.setTemperature(20);
	}
}
