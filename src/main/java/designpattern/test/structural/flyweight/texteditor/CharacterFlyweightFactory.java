package designpattern.test.structural.flyweight.texteditor;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory
public class CharacterFlyweightFactory {

	private Map<String, CharacterFlyweight> flyweights = new HashMap<>();

	public CharacterFlyweight getCharacterFlyweight(char character, String font, int fontSize) {
		String key = character + "_" + font + "_" + fontSize;
		return flyweights.computeIfAbsent(key, k -> {
			System.out.println("Created flyweight for key: " + k);
			return new ConcreteCharacterFlyweight(character, font, fontSize);
		});
	}

	public int getFlyweightSize() {
		return flyweights.size();
	}
}
