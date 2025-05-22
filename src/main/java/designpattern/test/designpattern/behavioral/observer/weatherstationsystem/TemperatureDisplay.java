package designpattern.test.designpattern.behavioral.observer.weatherstationsystem;

// ConcreteObserver
public class TemperatureDisplay implements WeatherObserver {

	private String displayName;

	public TemperatureDisplay(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public void update(int temperature) {
		System.out.println(displayName + " (Push): Temperature is " + temperature + "°C");
	}

	@Override
	public void update(WeatherStation weatherStation) {
		// TODO Auto-generated method stub

	}

}
