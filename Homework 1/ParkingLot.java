import java.util.Scanner;

public class ParkingLot {
	
	ParkingSpot[] lot = new ParkingSpot[20];
	
	public ParkingLot() {
		for (int i = 0; i < 20; i++) {
			if (i < 16) {
				lot[i] = new ParkingSpot(false, true, null); // Non-handicapped, vacant, no car
			}
			else if (i > 15) {
				lot[i] = new ParkingSpot(true, true, null); // Handicapped, vacant, no car
			}
		}
	}
	
	public int parkCar(Car carToPark) {
		for (int i = 0; i < 20; i++) {
			if (lot[i].isVacant == true && lot[i].isHandicapped == false && i < 16) {
				lot[i].setParkedCar(carToPark);
				lot[i].setVacancy(false);
				return i;
			}
			else if (lot[i].isVacant == true && lot[i].isHandicapped == true && carToPark.isHandicapped == true && i > 15) {
				lot[i].setParkedCar(carToPark);
				lot[i].setVacancy(false);
				return i;
			}
			else if (lot[i].isVacant == false) {
				return -1;
			}
		}
		return 0;
	}
	
	public void removeCar() {
		Scanner takeInt = new Scanner(System.in);
		
		int someInt;
		System.out.println("Spot to remove car from: ");
		someInt = takeInt.nextInt();
		
		if (lot[someInt].isVacant == false) {
			lot[someInt].setParkedCar(null);
			lot[someInt].setVacancy(true);
		}
		else if (lot[someInt].isVacant == true ) {
			System.out.println("This parking spot is vacant.");
		}
	}
}