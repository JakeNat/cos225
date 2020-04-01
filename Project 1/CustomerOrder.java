public class CustomerOrder {
	String name;
	String date;
	int quantity;
	double balance;
	
	public CustomerOrder() {
		this.name = null;
		this.date = null;
		this.quantity = 0;
		this.balance = 0;
	}
	
	public CustomerOrder(String name,String date,int quantity,double balance) {
		this.name = name;
		this.date = date;
		this.quantity = quantity;
		this.balance = balance;
	}
	
	public void shipProduct() {
		if (quantity > 0) {
			this.quantity--;
		} else {
			System.out.println("Out of stock.");
		}
	}
	
	public void payBalance(double payment) {
		if ((balance - payment) >= 0) {
			balance -= payment;
		} else {
			System.out.println("Balance will become negative. Please try again.");
		}
	}
	
	@Override
	public String toString() {
		return name + " " + date + " " + quantity + " " + balance;
	}
}