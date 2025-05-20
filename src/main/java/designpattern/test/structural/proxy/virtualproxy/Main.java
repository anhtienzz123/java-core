package designpattern.test.structural.proxy.virtualproxy;

// Client code
public class Main {

	public static void main(String[] args) {
		Image image1 = new ImageProxy("file1.png");
		Image image2 = new ImageProxy("file2.png");
		
		System.out.println("-- First");
		image1.display();
		image2.display();
		
		System.out.println("-- Second");
		image1.display();
		image2.display();
	}
}
