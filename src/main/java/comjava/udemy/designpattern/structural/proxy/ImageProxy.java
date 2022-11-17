package comjava.udemy.designpattern.structural.proxy;

import java.awt.Point;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ImageProxy implements Image {

    private String name;

    private BitmapImage bitmapImage;

    private Point location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point point) {
        if (bitmapImage != null) {
            bitmapImage.setLocation(point);
        } else {
            location = point;
        }
    }

    @Override
    public Point getLocation() {
        if (bitmapImage != null) {
            return bitmapImage.getLocation();
        }

        return location;
    }

    @Override
    public void render() {
        if (bitmapImage == null) {
            bitmapImage = new BitmapImage(name);
            if(location != null) {
                bitmapImage.setLocation(location);
            }
        }
        
        bitmapImage.render();
    }
}
