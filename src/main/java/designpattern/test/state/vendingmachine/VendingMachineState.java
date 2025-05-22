package designpattern.test.state.vendingmachine;

// State
public interface VendingMachineState {

	void insertCoin(VendingMachine context);

	void ejectCoin(VendingMachine context);

	void pressDispense(VendingMachine context);
}
