package designpattern.test.structural.bridge.graphicsapplication;

// Refined Abstraction
public class Rectangle extends Shape {

	private int width;
	private int height;

	protected Rectangle(Renderer renderer, int width, int height) {
		super(renderer);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		this.renderer.renderRectangle(width, height);
	}
}
