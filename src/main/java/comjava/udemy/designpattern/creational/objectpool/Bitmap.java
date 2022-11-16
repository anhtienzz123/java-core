package comjava.udemy.designpattern.creational.objectpool;

import java.awt.Point;

public class Bitmap implements Image {

    private Point location;

    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " @ " + location);

    }

    @Override
    public Point getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point point) {
        this.location = point;
    }
    
    @Override
    public void reset() {
        this.location = null;
        System.out.println("Bitmap is reset");
    }
}
