package designpattern.creational.factorymethod.logistics;

public class Main {
	
	public static void main(String[] args) {
		Logistics logistics;

		logistics = new RoadLogistics();
		logistics.planDeliver(); // output: Delivering by land in a box

		logistics = new SeaLogistics();
		logistics.planDeliver(); // output: Delivering by sea in a container
	}
}
