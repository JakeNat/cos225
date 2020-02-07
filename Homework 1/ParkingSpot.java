
public class ParkingSpot {
	Car parkedCar;
	boolean isHandicapped;
	boolean isVacant;
	
	public ParkingSpot() {
		this.parkedCar = null;
		this.isHandicapped = false;
		this.isVacant = true;
	}
	
	public ParkingSpot(boolean isHandicapped, boolean isVacant, Car carToPark) {
		this.isHandicapped = isHandicapped;
		this.isVacant = isVacant;
		this.parkedCar = carToPark;
	}
	
	public void setVacancy(boolean isVacant) {
		this.isVacant = isVacant;
	}
	
	public void setParkedCar(Car carToPark) {
		this.parkedCar = carToPark;
	}
	
	public boolean getVacancy() {
		return this.isVacant;
	}
	
	public boolean getHandicapped() {
		return isHandicapped;
	}

	public int getCar() {
		System.out.println("Currently parked: " + parkedCar.getColor() + " "+ parkedCar.getMake() + " " + parkedCar.getModel());
		return 0;
	}
	
	public void setHandicapped(boolean isHandicapped) {
		this.isHandicapped = isHandicapped;
	}	

	public static void main(String[] args) {
		
	}
}