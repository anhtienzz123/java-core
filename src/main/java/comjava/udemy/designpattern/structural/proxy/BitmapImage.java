package comjava.udemy.designpattern.structural.proxy;

import java.awt.Point;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class BitmapImage implements Image {

    private Point location;

    private String name;

    public BitmapImage(String filename) {
        System.out.println("Loaded from disk: " + filename);
        this.name = filename;
    }

    @Override
    public void setLocation(Point point) {
        this.location = point;
    }

    @Override
    public Point getLocation() {
        return location;
    }


    @Override
    public void render() {
        System.out.println("Rendered: " + this.name);
    }
}
