package designpattern.creational.abstractfactory.databaseconnectivity;

// AbstractProduct
public interface Connection {

	void open();
	
	void close();
}
