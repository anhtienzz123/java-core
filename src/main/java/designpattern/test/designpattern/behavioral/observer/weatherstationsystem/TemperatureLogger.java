package designpattern.test.designpattern.behavioral.observer.weatherstationsystem;

// ConcreteObserver
public class TemperatureLogger implements WeatherObserver {

	private String loggerName;

	public TemperatureLogger(String loggerName) {
		this.loggerName = loggerName;
	}

	@Override
	public void update(int temperature) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(WeatherStation weatherStation) {
		System.out.println(loggerName + " (Pull): Logged temperature: " + weatherStation.getTemperature() + "°C");
	}

}
