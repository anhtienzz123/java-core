package designpattern.test.iterator.bookcollection;

// ConcreteIterator
public class LibraryIterator implements BookIterator {

	private Library library;
	private int currentIndex;

	public LibraryIterator(Library library) {
		this.library = library;
		this.currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < this.library.getSize();
	}

	@Override
	public Book next() {
		if (!hasNext()) {
			throw new IndexOutOfBoundsException(currentIndex);
		}

		Book book = this.library.getBook(currentIndex);
		currentIndex++;
		return book;
	}

}
