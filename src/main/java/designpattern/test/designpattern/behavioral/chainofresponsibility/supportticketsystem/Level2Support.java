package designpattern.test.designpattern.behavioral.chainofresponsibility.supportticketsystem;

// Concrete Handler
public class Level2Support implements SupportHandler {

	private SupportHandler nextHandler;

	@Override
	public void handleRequest(Ticket ticket) {
		if (ticket.severity() == 2) {
			System.out.println("Level 2 Support: Handling ticket - " + ticket.description());
		} else if (nextHandler != null) {
			System.out.println("Level 2 Support: Passing ticket to next level");
			nextHandler.handleRequest(ticket);
		} else {
			System.out.println("Level 2 Support: No handler available for ticket - " + ticket.description());
		}
	}

	@Override
	public void setNextHandler(SupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
