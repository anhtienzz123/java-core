package designpattern.creational.factorymethod.logistics;

// Creator
public abstract class Logistics {

	// Factory method
	public abstract Transport createTransport();

	// Common logic that uses the product
	public void planDeliver() {
		Transport transport = this.createTransport();
		transport.deliver();
	}
}
