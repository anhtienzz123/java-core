package designpattern.test.mediator.chatapplication;

public class Main {

	public static void main(String[] args) {
		ChatMediator chatRoom = new ChatRoom();
		
		// User
		User user1 = new ChatUser(chatRoom, "user1");
		User user2 = new ChatUser(chatRoom, "user2");
		
		// Join chat rom
		chatRoom.addUser(user1);
		chatRoom.addUser(user2);
		
		// Send message
		user1.sendMessage("Hello user2");
		user2.sendMessage("Hi user1");
	}
}
