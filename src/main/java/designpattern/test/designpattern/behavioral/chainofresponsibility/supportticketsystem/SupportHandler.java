package designpattern.test.designpattern.behavioral.chainofresponsibility.supportticketsystem;

// Handler
public interface SupportHandler {

	void handleRequest(Ticket ticket);
	
	void setNextHandler(SupportHandler nextHandler);
}
