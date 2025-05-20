package designpattern.test.structural.composite.filesystem;

// Component
public interface FileSystemComponent {

	String getName();
	
	int getSize();
	
	void add(FileSystemComponent component);
	
	void remove(FileSystemComponent component);
}
