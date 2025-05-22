package designpattern.test.state.vendingmachine;

// Context
public class VendingMachine {

	private int inventory;
	private VendingMachineState state;

	// State
	private final VendingMachineState noCoinState = new NoCoinState();
	private final VendingMachineState hasCointState = new HasCoinState();
	private VendingMachineState soldState = new SoldState();
	private VendingMachineState soldOutState = new SoldOutState();

	public VendingMachine(int inventory) {
		this.inventory = inventory;
		this.state = inventory > 0 ? this.noCoinState : this.soldOutState;
		System.out.println("Vending machine initialized with " + inventory + " items");
	}

	public void insertCoin() {
		this.state.insertCoin(this);
	}

	public void ejectCoin() {
		this.state.ejectCoin(this);
	}

	public void pressDispense() {
		this.state.pressDispense(this);
	}

	public void setState(VendingMachineState state) {
		this.state = state;
		System.out.println("State changed to: " + state.getClass().getSimpleName());
	}

	public int getInventory() {
		return this.inventory;
	}

	public void dispenseItem() {
		this.inventory--;
		System.out.println("Item dispensed. Inventory remaining: " + this.inventory);
	}

	public VendingMachineState getNoCoinState() {
		return this.noCoinState;
	}

	public VendingMachineState getHasCointState() {
		return this.hasCointState;
	}

	public VendingMachineState getSoldState() {
		return this.soldState;
	}

	public VendingMachineState getSoldOutState() {
		return this.soldOutState;
	}
}
