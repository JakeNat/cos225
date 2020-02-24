
public class Animal {
	String name;
	
	public Animal() {
		this.name = null;
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Animal Name: " + name + " ";
	}
}