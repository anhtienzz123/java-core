package comjava.udemy.designpattern.creational.simplefactory;

public class SimpleFactoryMain {

    public static void main(String[] args) {
        Blog productBlog = BlogFactory.getBlog(BlogType.PRODUCT);
        Blog newsBlog = BlogFactory.getBlog(BlogType.NEWS);

        System.out.println("productBlog: " + productBlog);
        System.out.println("newsBlog: " + newsBlog);
    }
}
