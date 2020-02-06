
public class Car {	
	String make;
	String model;
	String color;
	boolean canWalk;
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getDisability() {
		return canWalk;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setDisability(boolean canWalk) {
		this.canWalk = canWalk;
	}
	
	public Car() {
		this.make = "Lexus";
		this.model = "RX";
		this.color = "Blue";
		this.canWalk = true;	
	}
	
	public Car(String make, String model, String color, boolean canWalk) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.canWalk = canWalk;
	}
	
	public static void main(String[] args) {
		Car car = new Car("Mazda","3","black",true);
		System.out.println(car);
	}
}