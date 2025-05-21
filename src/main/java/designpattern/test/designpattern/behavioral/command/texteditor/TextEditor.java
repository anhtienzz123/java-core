package designpattern.test.designpattern.behavioral.command.texteditor;

// Receiver
public class TextEditor {

	private StringBuffer text = new StringBuffer();

	public void type(char character) {
		this.text.append(character);
		System.out.println("Typed: " + character + ", Text: " + text);
	}

	public void delete() {
		if (this.text.length() == 0) {
			System.out.println("Nothing to delete");
			return;
		}

		int characterLastIndex = this.text.length() - 1;
		char deletedCharacter = this.text.charAt(characterLastIndex);
		this.text.deleteCharAt(characterLastIndex);

		System.out.println("Deleted: " + deletedCharacter + ", Text: " + text);
	}

	public String getText() {
		return text.toString();
	}
}
