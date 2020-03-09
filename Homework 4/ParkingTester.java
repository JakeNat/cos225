public class ParkingTester {

	public static void main(String[] args) {
		// Create a ParkingManager
		ParkingManager lot = new ParkingManager();
		
		// Cars
		Car mazda = new Car("Mazda","3");
		Car ford = new Car("Ford","F150");
		Car subaru = new Car("Subaru","WRX STI");
		
		// Add five cars to the lot
		lot.parkCar(mazda);
		lot.parkCar(ford);
		lot.parkCar(subaru);
		lot.parkCar(ford);
		lot.parkCar(subaru);
		
		
		// Call toString()
		System.out.println(lot);
		
		// Remove the third car
		lot.removeCar(3);
		
		// Call toString()
		System.out.println(lot);
		
		// Remove a car that does not exist
		lot.removeCar(7);
		
		// Call toString()
		System.out.println(lot);
		
		// Remove the car farthest into the stack
		lot.removeCar(0);
		
		// Call toString()
		System.out.println(lot);
	}
}