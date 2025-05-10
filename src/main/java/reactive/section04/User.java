package reactive.section04;

import lombok.Data;
import net.datafaker.Faker;

@Data
public class User {

    private int id;
    private String name;

    public User(int id) {
        this.id = id;
        this.name = new Faker().name().fullName();
    }
}
