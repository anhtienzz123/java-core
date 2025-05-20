package designpattern.test.structural.bridge.graphicsapplication;

// Implementor, Implementation
public interface Renderer {

	void renderCircle(int radius);
	
	void renderRectangle(int width, int height);
}
