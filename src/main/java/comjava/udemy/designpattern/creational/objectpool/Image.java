package comjava.udemy.designpattern.creational.objectpool;

import java.awt.Point;

public interface Image extends Poolable {

    void draw();
    
    Point getLocation();
    
    void setLocation(Point point);
}
