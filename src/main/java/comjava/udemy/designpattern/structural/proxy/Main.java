package comjava.udemy.designpattern.structural.proxy;

import java.awt.Point;

public class Main {

    public static void main(String[] args) {
        Image image = ImageFactory.getImage("anh1.png");
        
        image.setLocation(new Point(1, 1));
        System.out.println("location: " + image.getLocation());
        System.out.println("render image");
        image.render();
    }
}
  