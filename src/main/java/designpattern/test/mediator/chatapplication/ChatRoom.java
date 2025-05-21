package designpattern.test.mediator.chatapplication;

import java.util.ArrayList;
import java.util.List;

// ConcreteMediator
public class ChatRoom implements ChatMediator {

	private List<User> users = new ArrayList<>();

	@Override
	public void sendMessage(String message, User user) {
		this.users.stream().filter(uEle -> uEle != user)
				.forEach(uEle -> uEle.reciveMessage(message + " (from " + user.getName() + ")"));
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		System.out.println(user.getName() + " joined the chat room");
	}
}
