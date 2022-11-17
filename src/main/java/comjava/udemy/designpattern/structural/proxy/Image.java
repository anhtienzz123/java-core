package comjava.udemy.designpattern.structural.proxy;

import java.awt.Point;

public interface Image {

    void setLocation(Point point);
    
    Point getLocation();
    
    void render();
}
