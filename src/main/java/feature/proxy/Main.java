package feature.proxy;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		UserService realService = new UserServiceImpl();
		UserService proxy = (UserService) Proxy.newProxyInstance(
		    UserService.class.getClassLoader(),
		    new Class[]{UserService.class},
		    new LoggingHandler(realService)
		);
		
		// Create user
		proxy.createUser("user1");
		
		// Get user
		System.out.println("----------");
		User user = proxy.getUser(1);
		System.out.println("Get user: " + user);
		
//		== Output:
//		Before method: createUser
//		User created: user1
//		After method: createUser
//		----------
//		Before method: getUser
//		Retrieving user with ID: 1
//		After method: getUser
//		Get user: User[id=1, name=User1]
	}
}
