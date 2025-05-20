package designpattern.test.structural.bridge.graphicsapplication;

// ConcreteImplementor
public class VectorRenderer implements Renderer {

	@Override
	public void renderCircle(int radius) {
		System.out.println("Drawing a circle with radius " + radius + " using Vector rendering");

	}

	@Override
	public void renderRectangle(int width, int height) {
		System.out.println(
				"Drawing a rectangle with width " + width + " and height " + height + " using Vector rendering");
	}

}
