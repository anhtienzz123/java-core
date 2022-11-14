package comjava.udemy.designpattern.creational.simplefactory;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductBlog extends Blog {

    private BlogType type = BlogType.PRODUCT;

    public ProductBlog(int id, String name) {
        super.id = id;
        super.name = name;
    }
}
