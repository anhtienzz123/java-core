package designpattern.test.structural.proxy.virtualproxy;

// Real Subject
public class RealImage implements Image {

	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		this.loadImage();
	}

	private void loadImage() {
		System.out.println("Loading image from file: " + filename);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void display() {
		System.out.println("Displaying image: " + filename);
	}
}
