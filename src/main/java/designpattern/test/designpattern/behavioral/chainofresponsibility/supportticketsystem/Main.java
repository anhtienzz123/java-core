package designpattern.test.designpattern.behavioral.chainofresponsibility.supportticketsystem;

public class Main {

	public static void main(String[] args) {
		// Ticket
		Ticket ticket1 = new Ticket("ticket level 1", 1);
		Ticket ticket2 = new Ticket("ticket level 2", 2);
		Ticket ticket3 = new Ticket("ticket level 3", 3);
		Ticket ticket4 = new Ticket("ticket level 4", 4);
		
		// Create chain of handler
		SupportHandler level1 = new Level1Support();
		SupportHandler level2 = new Level2Support();
		SupportHandler level3 = new Level3Support();
		level1.setNextHandler(level2);
		level2.setNextHandler(level3);
		
		// Handle ticket
		level1.handleRequest(ticket1);
		level1.handleRequest(ticket2);
		level1.handleRequest(ticket3);
		level1.handleRequest(ticket4);
	}
}
