package designpattern.test.structural.flyweight.texteditor;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		CharacterFlyweightFactory characterFactory = new CharacterFlyweightFactory();
		
		String text = "hello word";
		String font = "Arial";
		int fontSize = 14;
		int x = 0;
		int y = 20;
		
		for (char c : text.toCharArray()) {
			CharacterFlyweight character = characterFactory.getCharacterFlyweight(c, font, fontSize);
			character.render(x, y);
			 
			x += 10;
		}
		
		System.out.println("--");
		characterFactory.getCharacterFlyweight('h', font, fontSize).render(100, 200);
		characterFactory.getCharacterFlyweight('z', font, fontSize).render(200, 400);
		System.out.println("Flyweight size: " + characterFactory.getFlyweightSize());
		
	}
}
