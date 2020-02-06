
public class ParkingSpot {
	boolean handicapped;
	
	public ParkingSpot() {
		this.handicapped = false;
	}
	
	public ParkingSpot(boolean handicapped) {
		this.handicapped = handicapped;
	}
	
	public static int getCar(Car car) {
		System.out.println("Current parked car: " + car.getColor() + " "+ car.getMake() + " " + car.getModel());
		return 0;
	}
	
	public boolean getHandicapped(ParkingSpot parkingSpot) {
		if (parkingSpot.handicapped == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setHandicapped(boolean handicapped) {
		this.handicapped = handicapped;
	}

	public static void main(String[] args) {
		ParkingSpot one = new ParkingSpot();
		System.out.println(one.getHandicapped(one));
		
	}

}
