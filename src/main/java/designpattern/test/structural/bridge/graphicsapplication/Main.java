package designpattern.test.structural.bridge.graphicsapplication;

public class Main {

	public static void main(String[] args) {
		Renderer vectorRenderer = new VectorRenderer();
		Renderer rasterRenderer = new RasterRenderer();
		
		Shape circle1 = new Circle(vectorRenderer, 10);
		Shape circle2 = new Circle(rasterRenderer, 20);
		Shape rectangle = new Rectangle(vectorRenderer, 10, 20);
		
		circle1.draw();
		circle2.draw();
		rectangle.draw();
		
	}
}
