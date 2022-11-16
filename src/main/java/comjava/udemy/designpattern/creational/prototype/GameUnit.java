package comjava.udemy.designpattern.creational.prototype;

import java.awt.Point;
import lombok.Data;

@Data
public abstract class GameUnit implements Cloneable{

    private Point point = new Point(0, 0);
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        GameUnit gameUnit = (GameUnit) super.clone();
        gameUnit.initialize();
        return gameUnit;
    }
    
    private void initialize() {
        this.point = new Point(0, 0);
        resetUnit();
    }
    
    protected abstract void resetUnit();
    
    public void move(int x, int y) {
        point.setLocation(x, y);
    }
}
