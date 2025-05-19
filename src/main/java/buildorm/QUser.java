package buildorm;

public class QUser {
	public static final QUser user = new QUser();

	public final StringPath<User> name = new StringPath<>(User::getName);
	public final NumberPath<User> age = new NumberPath<>(User::getAge);
}
