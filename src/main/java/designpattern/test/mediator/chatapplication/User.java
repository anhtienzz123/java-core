package designpattern.test.mediator.chatapplication;

// Coleague
public abstract class User {

	protected ChatMediator chatMediator;
	protected String name;

	protected User(ChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void sendMessage(String message);

	public abstract void reciveMessage(String message);
}
