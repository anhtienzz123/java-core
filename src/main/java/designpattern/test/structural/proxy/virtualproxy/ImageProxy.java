package designpattern.test.structural.proxy.virtualproxy;

// Proxy
public class ImageProxy implements Image {

	private String filename;
	private Image realImage;

	public ImageProxy(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if (this.realImage == null) {
			this.realImage = new RealImage(filename);
		}

		realImage.display();
	}

}
