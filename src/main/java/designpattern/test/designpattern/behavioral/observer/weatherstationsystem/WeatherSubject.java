package designpattern.test.designpattern.behavioral.observer.weatherstationsystem;

// Subject
public interface WeatherSubject {

	void attach(WeatherObserver weatherObserver);

	void detach(WeatherObserver weatherObserver);

	void notifyObserver();
}
