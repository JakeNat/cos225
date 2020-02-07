
public class Car {	
	String make;
	String model;
	String color;
	boolean isHandicapped;
	
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
		return isHandicapped;
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
	
	public void setHandicap(boolean isHandicapped) {
		this.isHandicapped = isHandicapped;
	}
	
	public Car() {
		this.setMake("Lexus");
		this.setModel("RX");
		this.setColor("Blue");
		this.setHandicap(false);	
	}
	
	public Car(boolean isHandicapped) {
		this.setMake("Lexus");
		this.setModel("RX");
		this.setColor("Blue");
		this.setHandicap(isHandicapped);	
	}
	
	public static void main(String[] args) {
		Car car = new Car(true);
		System.out.println(car.getDisability());
	}
}