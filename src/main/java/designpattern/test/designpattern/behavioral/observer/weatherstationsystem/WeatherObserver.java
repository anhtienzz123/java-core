package designpattern.test.designpattern.behavioral.observer.weatherstationsystem;

// Observer
public interface WeatherObserver {

	void update(int temperature);
	
	void update(WeatherStation weatherStation);
}
