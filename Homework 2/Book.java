
public class Book {
	String title;
	
	public Book() {
		this.title = null;
	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public char getFirstChar() {
		char firstChar = title.charAt(0);
		return firstChar;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public static void main(String[] args) {
	
	}
}
