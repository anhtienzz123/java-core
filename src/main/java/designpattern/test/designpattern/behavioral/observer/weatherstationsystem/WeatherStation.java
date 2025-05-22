package designpattern.test.designpattern.behavioral.observer.weatherstationsystem;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class WeatherStation implements WeatherSubject {

	private int temperature;
	private List<WeatherObserver> weatherObservers;

	public WeatherStation() {
		this.temperature = 0;
		this.weatherObservers = new ArrayList<>();
	}

	@Override
	public void attach(WeatherObserver weatherObserver) {
		this.weatherObservers.add(weatherObserver);
		System.out.println("Attached observer: " + weatherObserver);
	}

	@Override
	public void detach(WeatherObserver weatherObserver) {
		this.weatherObservers.remove(weatherObserver);
		System.out.println("Detached observer: " + weatherObserver);
	}

	@Override
	public void notifyObserver() {
		this.weatherObservers.forEach(woEle -> {
			woEle.update(temperature);
			woEle.update(this);
		});
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		this.notifyObserver();
	}

	public int getTemperature() {
		return this.temperature;
	}

}
