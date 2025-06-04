package feature.proxy;

public class UserServiceImpl implements UserService {

	@Override
	public void createUser(String name) {
		// Implementation for creating a user
		System.out.println("User created: " + name);
	}

	@Override
	public User getUser(int id) {
		// Implementation for retrieving a user
		System.out.println("Retrieving user with ID: " + id);
		return new User(id, "User" + id); // Example user creation
	}
}
