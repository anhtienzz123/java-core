package comjava.udemy.designpattern.creational.simplefactory;

public class BlogFactory {

    public static Blog getBlog(BlogType blogType) {

        switch (blogType) {
            case PRODUCT:
                return new ProductBlog(1, "product blog");
            case NEWS:
                return new NewsBlog(2, "news blog");
            default:
                throw new IllegalArgumentException("Unexpected value: " + blogType);
        }
    }
}
