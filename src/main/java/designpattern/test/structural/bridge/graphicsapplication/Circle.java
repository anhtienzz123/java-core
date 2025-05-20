package designpattern.test.structural.bridge.graphicsapplication;

// RefinedAbstraction 
public class Circle extends Shape {

	private int radius;
	
	protected Circle(Renderer renderer, int radius) {
		super(renderer);
		this.radius = radius;
	}

	@Override
	public void draw() {
		this.renderer.renderCircle(radius);
	}
}
