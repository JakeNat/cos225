import java.util.ArrayList;

public class BookShelf {
	char shelfChar;
	ArrayList<Book> shelf;
	
	public BookShelf(char shelfChar) {
		this.shelfChar = shelfChar;
		this.shelf = new ArrayList<Book>();
	}
	
	public char getChar() {
		return this.shelfChar;
	}
	
	public void setTitleChar(char shelfChar) {
		this.shelfChar = shelfChar;
	}
	
	public void addBook(Book book) {
		for (int i = 0; i < shelf.size(); i++) {
			if (book.getFirstChar() == shelfChar) {
				shelf.add(book);
			}
			else if (book.getFirstChar() != shelfChar) {
				System.out.println("This book cannot go on this shelf.");
			}
		}
	}
	
	public void removeBook(Book book) {
		shelf.remove(book);
	}
	
	public void removeDuplicates() {
		for (int i = 0; i < shelf.size(); i++) {
			for (int j = 0; j < shelf.size(); j++) {
				if (shelf.get(i).getTitle() == shelf.get(j).getTitle()) {
					shelf.remove(j);
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String title = "";
		
		for (int i = 0; i < shelf.size(); i++) {
			String temp = shelf.get(i).getTitle();
			
			if (shelf.get(i) != null) {
				title.concat(temp + ", ");
			}
			else {
				title.concat(temp);
			}
		}
		return title;
	}
	
	public static void main(String[] args) {
		char shelfChar = 'a';
		BookShelf shelf = new BookShelf(shelfChar);
		System.out.println(shelf.getChar());
	}
}
