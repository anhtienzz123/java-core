package designpattern.test.structural.flyweight.texteditor;

// ConcreteFlyweight
public class ConcreteCharacterFlyweight implements CharacterFlyweight {

	private char character;
	private String font;
	private int fontSize;

	public ConcreteCharacterFlyweight(char character, String font, int fontSize) {
		this.character = character;
		this.font = font;
		this.fontSize = fontSize;
	}

	@Override
	public void render(int x, int y) {
		System.out.println("Rendering character '" + character + "' at position (" + x + ", " + y + ") with font "
				+ font + ", size " + fontSize);
	}
}
