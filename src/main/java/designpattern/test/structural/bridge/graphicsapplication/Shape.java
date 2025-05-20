package designpattern.test.structural.bridge.graphicsapplication;

// Abstraction
public abstract class Shape {

	protected Renderer renderer;

	protected Shape(Renderer renderer) {
		this.renderer = renderer;
	}

	public abstract void draw();
}
