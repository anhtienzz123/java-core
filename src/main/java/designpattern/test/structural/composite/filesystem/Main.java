package designpattern.test.structural.composite.filesystem;

public class Main {

	public static void main(String[] args) {
		// Files
		FileSystemComponent file1 = new File("file1", 1000);
		FileSystemComponent file2 = new File("file2", 2000);
		FileSystemComponent file3 = new File("file3", 3000);

		// Directory
		FileSystemComponent directory1 = new Directory("directory1");
		FileSystemComponent directory2 = new Directory("directory2");
		FileSystemComponent root = new Directory("root");

		directory1.add(file1);
		directory1.add(file2);

		directory2.add(file3);

		root.add(directory1);
		root.add(directory2);

		System.out.println(directory1.getName() + ": " + directory1.getSize()); // directory1: 3000
		System.out.println(directory2.getName() + ": " + directory2.getSize()); // directory2: 3000
		System.out.println(root.getName() + ": " + root.getSize()); // root: 6000
	}
}
