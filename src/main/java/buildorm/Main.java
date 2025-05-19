package buildorm;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<User> users = List.of(new User("Alice", 30), new User("Bob", 17), new User("Charlie", 25),
				new User("Alice", 22));

		QUser user = QUser.user;

		List<User> result = Query.from(users).where(user.name.eq("Alice").and(user.age.gt(25))).fetch();

		result.forEach(System.out::println); // Alice (30)
	}
}
