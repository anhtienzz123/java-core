package reactive.section04;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class User {

    private int id;
    private String name;

    public User(int id) {
        this.id = id;
        this.name = Faker.instance().name().fullName();
    }
}
