
public class LibraryTester {

	public static void main(String[] args) {
		// Bookshelves
		BookShelf shelfA = new BookShelf('a');
		BookShelf shelfC = new BookShelf('c');
		BookShelf shelfD = new BookShelf('d');
		
		Book animalFarm = new Book("Animal Farm");
		shelfA.addBook(animalFarm);
		Book animals = new Book("Animals");
		shelfA.addBook(animals);
		
		shelfA.toString();
	}

}
