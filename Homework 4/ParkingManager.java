public class ParkingManager extends ArrayStack {
	int numOfCars;
	ArrayStack<Car> cars = new ArrayStack<Car>(5);
	
	public int getNumOfCars() {
		return numOfCars;
	}
	
	public ParkingManager() {
		this.numOfCars = 0;
	}
	
	public void parkCar(Car car) {
		if (numOfCars <= 5 && numOfCars > -1) {
			cars.push(car);
			numOfCars++;
		}
		else if (numOfCars > 5) {
			System.out.println("The lot is full.");
		}
	}
	
	public void removeCar(int index) {
		ArrayStack<Car> temp = new ArrayStack<Car>(5);
		for (int i = numOfCars; i > index; i--) {
			temp.push(cars.pop());
			numOfCars--;
		}
		cars.pop();
		for (int i = index; i < numOfCars; i++) {
			cars.push(temp.pop());
			numOfCars++;
		}
	}
	
	@Override
	public String toString() {
		return cars.toString();
	}
	
	public static void main(String[] args) {
		Car mazda = new Car("Mazda","3");
		Car cock = new Car("Cock","Penis");
		ParkingManager lot = new ParkingManager();
		lot.parkCar(mazda);
		lot.parkCar(cock);
		lot.parkCar(mazda);
		System.out.println(lot);
		lot.removeCar(2);
		System.out.println(lot);
	}
}