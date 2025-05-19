package designpattern.creational.factorymethod.logistics;

// ConcreteCreator
public class RoadLogistics extends Logistics {
	
	@Override
	public Transport createTransport() {
		return new Truck();
	}
}
