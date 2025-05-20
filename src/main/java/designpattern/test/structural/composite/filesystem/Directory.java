package designpattern.test.structural.composite.filesystem;

import java.util.ArrayList;
import java.util.List;

// Composite: contains children Leaf
public class Directory implements FileSystemComponent {

	private String name;
	private List<FileSystemComponent> components;

	public Directory(String name) {
		this.name = name;
		this.components = new ArrayList<>();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		return components.stream().mapToInt(ele -> ele.getSize()).sum();
	}

	@Override
	public void add(FileSystemComponent component) {
		this.components.add(component);
	}

	@Override
	public void remove(FileSystemComponent component) {
		this.components.remove(component);
	}

}
