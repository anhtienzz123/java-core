package feature.proxy;

//Interface to be proxied
public interface UserService {
	void createUser(String name);

	User getUser(int id);
}
