
public class ParkingSpot {
	boolean handicapped;
	Car parkedCar;
	
	public ParkingSpot() {
		this.handicapped = false;
		this.parkedCar = new Car();
	}
	
	public ParkingSpot(boolean handicapped) {
		this.handicapped = handicapped;
		if (handicapped == true) {
			this.parkedCar = new Car(true);
		}
		else {
			this.parkedCar = new Car();
		}
	}
	
	public void setHandicapped(boolean handicapped) {
		this.handicapped = handicapped;
	}
	
	public int getCar(ParkingSpot parkingSpot) {
		System.out.println("Currently parked: " + parkedCar.getColor() + " "+ parkedCar.getMake() + " " + parkedCar.getModel());
		return 0;
	}
	
	public boolean getHandicapped() {
		return handicapped;
	}

	public static void main(String[] args) {
		ParkingSpot one = new ParkingSpot();
		one.getCar(one);
	}

}
