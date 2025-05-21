package designpattern.test.iterator.bookcollection;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection {

	private List<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		this.books.add(book);
	}

	public int getSize() {
		return this.books.size();
	}

	public Book getBook(int index) {
		return this.books.get(index);
	}

	@Override
	public BookIterator createIterator() {
		return new LibraryIterator(this);
	}
}
