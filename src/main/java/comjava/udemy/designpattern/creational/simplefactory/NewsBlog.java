package comjava.udemy.designpattern.creational.simplefactory;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NewsBlog extends Blog {

    private BlogType type = BlogType.NEWS;

    public NewsBlog(int id, String name) {
        super.id = id;
        super.name = name;
    }
}
