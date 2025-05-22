package designpattern.test.state.vendingmachine;

// Client code
public class Main {

	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine(2);
		
		System.out.println("-- Buy 1");
		machine.insertCoin();
		machine.pressDispense();
		machine.pressDispense();
		
		System.out.println("-- Buy 2");
		machine.insertCoin();
		machine.pressDispense();
		machine.pressDispense();
		
		System.out.println("-- Buy 3");
		machine.insertCoin();
		machine.ejectCoin();
		machine.pressDispense();
	}
}
