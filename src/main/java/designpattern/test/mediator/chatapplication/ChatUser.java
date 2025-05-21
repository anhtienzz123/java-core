package designpattern.test.mediator.chatapplication;

// ConcreteColleague
public class ChatUser extends User {

	public ChatUser(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(String message) {
		this.chatMediator.sendMessage(message, this);
	}

	@Override
	public void reciveMessage(String message) {
		System.out.println(message);
	}

}
