import java.util.Scanner;

public class ParkingLot {
	
	static ParkingSpot[] lot = new ParkingSpot[20];
	
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
	
	public static int parkCar(Car carToPark) {
		for (int i = 0; i < 20; i++) {
			if (lot[i].isVacant == true && lot[i].isHandicapped == false && i < 16) {
				lot[i].setParkedCar(carToPark);
				lot[i].setVacancy(false);
				return i;
			}
			else if (lot[i].isVacant == true && lot[i].isHandicapped == true && carToPark.handicapped == true && i > 15) {
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
	
	public static void removeCar() {
		Scanner takeInt = new Scanner(System.in);
		
		int someInt;
		System.out.println("Spot to remove car from: ");
		someInt = takeInt.nextInt();
		
		lot[someInt].setParkedCar(null);
		lot[someInt].setVacancy(false);
	}
	
	public static void main(String[] args) {
		
	}
}