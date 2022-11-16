package comjava.udemy.designpattern.creational.objectpool;

import java.awt.Point;

public class Main {

    public static final ObjectPool<Bitmap> bitmapPool =
            new ObjectPool<>(() -> new Bitmap("bitmap"), 5);
    
    public static void main(String[] args) {
        Bitmap bitmap1 = bitmapPool.get();
        bitmap1.setLocation(new Point(1, 1));
        Bitmap bitmap2 = bitmapPool.get();
        bitmap2.setLocation(new Point(2, 2));
        
        bitmap1.draw();
        bitmap2.draw();
        
        bitmapPool.release(bitmap1);
        bitmapPool.release(bitmap2);
    }
}
