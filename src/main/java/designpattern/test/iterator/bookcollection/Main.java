package designpattern.test.iterator.bookcollection;

public class Main {

	public static void main(String[] args) {
		// Create Library
		Library library = new Library();
		library.addBook(new Book(1, "Book 1"));
		library.addBook(new Book(2, "Book 2"));
		library.addBook(new Book(3, "Book 3"));
		library.addBook(new Book(4, "Book 4"));
		
		BookIterator bookIterator = library.createIterator();
		while(bookIterator.hasNext()) {
			System.out.println(bookIterator.next());
		}
	}
}
